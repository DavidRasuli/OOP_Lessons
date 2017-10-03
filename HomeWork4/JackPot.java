package HomeWork4;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by PC on 4/2/2017.
 */
public class JackPot {
    // fields
    private int _id;
    private static int _count = 0;
    // id will count how many instance of JP were created
    private String _name;
    private Hashtable<JackpotWinCategory, Long> _jackpotWinPrizeMap;
    private Hashtable<JackpotWinCategory, DemoDate> _lastJackpotWonMap;

    //getters and setters


    private void set_name(String _name) {
        this._name = _name;
    }


    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    // the setter for hashtable will only send us back one value or key (long)
    // it will get a value form the category
    public Long get_jackpotWinPrize(JackpotWinCategory jackpotWinCategory) {
        return _jackpotWinPrizeMap.get(jackpotWinCategory);

    }

    public DemoDate get_lastJackpotWon(JackpotWinCategory jackpotWinCategory) {
        return _lastJackpotWonMap.get(jackpotWinCategory);
    }


    //contractor
    public JackPot(String name) {
        _count++;
        _id = _count;
        _name = name;
        InitializeJackpotWinPrizeMap();
        InitializeLastJackpotWonMap();
    }

    public JackPot() {
        this("NA");
    }

    public JackPot(JackPot anotherJP) {
        this(anotherJP._name);
        this._jackpotWinPrizeMap = anotherJP._jackpotWinPrizeMap;
        this._lastJackpotWonMap = anotherJP._lastJackpotWonMap;

    }


    // methods
    private void InitializeJackpotWinPrizeMap() {
        _jackpotWinPrizeMap = new Hashtable<>();
        _jackpotWinPrizeMap.put(JackpotWinCategory.Small, 100L);
        _jackpotWinPrizeMap.put(JackpotWinCategory.Medium, 200L);
        _jackpotWinPrizeMap.put(JackpotWinCategory.Big, 300L);
        _jackpotWinPrizeMap.put(JackpotWinCategory.Huge, 400L);
    }

    private void InitializeLastJackpotWonMap() {
        _lastJackpotWonMap = new Hashtable<>();
    }


    public void setWin(JackpotWinCategory winCategory, DemoDate wonDate) {

        _lastJackpotWonMap.put(winCategory, wonDate);
        _jackpotWinPrizeMap.put(winCategory, 0L);
    }

    Boolean hasWonAllJackPots() {
        if (_lastJackpotWonMap.containsKey(JackpotWinCategory.Small) && _lastJackpotWonMap.containsKey(JackpotWinCategory.Medium)
                && _lastJackpotWonMap.containsKey(JackpotWinCategory.Big) && _lastJackpotWonMap.containsKey(JackpotWinCategory.Huge)) {
            return true;
        }
        return false;

    }

    String getJackpotInfo() {
        String aData, bData = "", cData = "";
        aData = "Jackpot Info: \nId: " + _id + "\nName: " + _name + "\n";
        for (Map.Entry<JackpotWinCategory, DemoDate> entry : _lastJackpotWonMap.entrySet()) {
            bData += "On " + entry.getKey() + " Category , Lastwin: " + entry.getValue().getFullDate() + "\n";
        }

        for (Map.Entry<JackpotWinCategory, Long> entry : _jackpotWinPrizeMap.entrySet()) {
            bData += "On " + entry.getKey() + " Category , WinPrize: " + entry.getValue() + "\n";
        }

        return aData + bData + cData;

    }


    JackpotWinCategory getHighestValue() throws Exception {
        Map.Entry<JackpotWinCategory, Long> maxEntry = null;

        for (Map.Entry<JackpotWinCategory, Long> entry : _jackpotWinPrizeMap.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }

        }
        if (maxEntry.getValue() == 0l) {
            throw null;
        }
        return maxEntry.getKey();
    }

    static boolean jackpotsAreEquivlent(JackPot jp1, JackPot jp2) {
        for (Map.Entry<JackpotWinCategory, Long> entry1 : jp1._jackpotWinPrizeMap.entrySet()) {
            JackpotWinCategory key1 = entry1.getKey();
            Long value1 = entry1.getValue();

            if (jp2._jackpotWinPrizeMap.containsKey(key1)) {
                JackpotWinCategory key2 = key1;
                Long value2 = jp2._jackpotWinPrizeMap.get(key2).longValue();
                if (!value1.equals(value2))  {
                    return false;
                }
            }

        }

        return true;
    }

}

