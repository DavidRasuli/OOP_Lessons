package HomeWork6;

import HomeWork5.DemoDate;

/**
 * Created by PC on 7/10/2017.
 */
public class DemoDateTime extends DemoDate {
    private int _hours;
    private int _minutes;
    private int _seconds;


    /**Getters/setters**/
    public int get_hours()
    {
        return _hours;
    }

    public boolean set_hours(int hours)
    {
        if (hours > 23 || hours < 0)
        {
            System.out.println("The hours need to be between 00 - 23 ");
            return false;
        }
        this._hours = hours;
        return true;
    }

    public int get_minutes()
    {
        return _minutes;
    }

    public boolean set_minutes(int minutes)
    {
        if (minutes > 59 || minutes < 0)
        {
            System.out.println("The minutes need to be between 00 - 59 ");
            return false;
        }
        this._minutes = minutes;
        return true;
    }

    public int get_seconds()
    {
        return _seconds;
    }

    public boolean set_seconds(int seconds)
    {
        if (seconds > 59 || seconds < 0)
        {
            System.out.println("The seconds need to be between 00 - 59 ");
            return false;
        }
        this._seconds = seconds;
        return true;
    }

    /**DemoDateTime Constructors - Default **/
    public DemoDateTime (int year, int month, int day, int hours, int minutes, int seconds)
    {
        super(year, month, day);

        set_hours(hours);
        set_minutes(minutes);
        set_seconds(seconds);
        this._hours = hours;
        this._minutes = minutes;
        this._seconds = seconds;
    }


    /**Default Constructor **/
    public DemoDateTime ()
    {
       this (1990,01,01,00,00,00);
    }

    /**Copy Constructor **/
    public DemoDateTime (DemoDateTime anotherDemoDateTime)
    {
        this (anotherDemoDateTime.get_year(),anotherDemoDateTime.getMonth(),anotherDemoDateTime.getDay(),
                anotherDemoDateTime.get_hours(),anotherDemoDateTime.get_minutes(),anotherDemoDateTime.get_seconds());
    }

    /**FixData**/
    private String fixHours (int hours)
    {
        if (hours < 10)
        {
            String format = String.format("%%0%dd",2);
            String result = String.format(format,hours);
            return result;
        }
        return Integer.toString(hours);
    }

    private String fixMinutes (int minutes)
    {
        if (minutes < 10)
        {
            String format = String.format("%%0%dd",2);
            String result = String.format(format,minutes);
            return result;
        }
        return Integer.toString(minutes);
    }

    private String fixSeconds (int seconds)
    {
        if (seconds < 10)
        {
            String format = String.format("%%0%dd",2);
            String result = String.format(format,seconds);
            return result;
        }
        return Integer.toString(seconds);
    }

    /**Methods**/

    public String getFullDate()
    {

        return super.getFullDate() + ", Time: " + fixHours(this._hours) + ":" + fixMinutes(this._minutes) +
                ":" + fixSeconds(this._seconds);
    }

    public void show ()
    {
        super.show();
        System.out.println(" "+ fixHours(_hours) + ":" + fixMinutes(_minutes) + ":" + fixSeconds(_seconds));
    }

    public void show (ShowOptions showOption)
    {
            super.show(showOption);
            System.out.println(" "+ fixHours(_hours) + ":" + fixMinutes(_minutes) + ":" + fixSeconds(_seconds));

    }

    public boolean valid()
    {
        super.valid();
        if(set_hours(_hours)==false || set_minutes(_minutes)==false || set_seconds(_seconds)==false)
        {
            System.out.println("The Date isn't Valid");
            return false;
        }
        System.out.println("The Date is Valid");
        return true;
    }



}
