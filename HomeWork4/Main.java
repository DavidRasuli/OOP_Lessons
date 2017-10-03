package HomeWork4;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        JackPot jp = new JackPot("blue");
        JackPot jp2 = new JackPot("red");


        System.out.println("the id of " + jp.get_name() + " is " + jp.get_id());
        System.out.println("the id of " + jp2.get_name() + " is " + jp2.get_id());

        System.out.println("the hash table win prize for Small is " + jp.get_jackpotWinPrize(JackpotWinCategory.Small));
        System.out.println("the hash table last win for Small is " + jp.get_lastJackpotWon(JackpotWinCategory.Small));


        JackPot jp3 = new JackPot();
        System.out.println("the id of " + jp3.get_name() + " is " + jp3.get_id());

        // test for setWin()
        System.out.println("******************");

        jp2.setWin(JackpotWinCategory.Small, new DemoDate(1988, 12, 12));
        System.out.println("the hash table win prize for Small is " + jp2.get_jackpotWinPrize(JackpotWinCategory.Small));
        System.out.println("the hash table last win for Small is " + jp2.get_lastJackpotWon(JackpotWinCategory.Small).getFullDate());


        // test for hasWonAllJackPots()
        System.out.println("******************");

        jp2.hasWonAllJackPots();
        if (jp2.hasWonAllJackPots()) {
            System.out.println("the user won all the jackpots");
        } else {
            System.out.println("the user did not won all the jackpots");
        }

        jp2.setWin(JackpotWinCategory.Medium, new DemoDate(1990, 12, 30));
        jp2.setWin(JackpotWinCategory.Big, new DemoDate(2017, 2, 20));
        jp2.setWin(JackpotWinCategory.Huge, new DemoDate(2017, 3, 3));

        if (jp2.hasWonAllJackPots()) {
            System.out.println("the user won all the jackpots");
        } else {
            System.out.println("the user did not won all the jackpots");
        }

        jp.setWin(JackpotWinCategory.Big, new DemoDate(2017, 3, 4));

        if (jp2.hasWonAllJackPots()) {
            System.out.println("the user won all the jackpots");
        } else {
            System.out.println("the user did not won all the jackpots");
        }

        //test getJackPotInfo
        System.out.println("******************");

        System.out.println(jp2.getJackpotInfo());
        System.out.println(jp.getJackpotInfo());


        // test highestValue
        System.out.println("******************");

        try  {
            jp2.getHighestValue();
            System.out.println("The highest value is " + jp2.getHighestValue());
        }
        catch (NullPointerException nullpointexception)   {
            System.out.println("There is no highest price");
        }


        try  {
            jp.getHighestValue();
            System.out.println("The highest value is " + jp.getHighestValue());
        }
        catch (NullPointerException nullpointexception)   {
            System.out.println("There is no highest price");
        }


        // test jackpotAreEquivalent
        System.out.println("******************");

        System.out.println("Are the jackpots equal " + JackPot.jackpotsAreEquivlent(jp,jp2));

        JackPot jp4 = new JackPot("grey");
        JackPot jp5 = new JackPot("blue");

        System.out.println("Are the jackpots equal " + JackPot.jackpotsAreEquivlent(jp4,jp5));




    }


}
