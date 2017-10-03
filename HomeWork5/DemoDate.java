package HomeWork5;

import HomeWork6.ShowOptions;

/**
 * Created by PC on 4/2/2017.
 */

// got the data from HomeWork3
public class DemoDate {
    protected int _year;
    protected int _month;
    protected int _day;


    /** All Parameters Constructor **/
    public DemoDate (int year, int month, int day)
    {
        setYear(year);
        setMonth(month);
        setDay(day);
        this._year = year;
        this._day=day;
        this._month=month;
    }

    /** Default Constructor **/
    public DemoDate ()
    {
        this(1990,01,01);
    }

    /** Copy Constructor **/
    public DemoDate (DemoDate anotherDemoDate)
    {
        this(anotherDemoDate.get_year(),anotherDemoDate.getMonth(),anotherDemoDate.getDay());
    }

    /*******************************/


    public int get_year()
    {
        return _year;
    }

    public boolean setYear(int year)
    {

        if (Integer.toString(year).length() != 4 && year < 999)
        {
            System.out.println("The Year need to be 4 digitalis ");
            return false;
        }
        this._year = year;
        return true;
    }

    public int getMonth()
    {
        fixMonth(_month);
        return _month;
    }

    public boolean setMonth(int month)
    {
        if(month < 1 || month > 12)
        {
            System.out.println("The Month value should be between 01 to 12");
            return false;
        }

        this._month = month;
        //fixMonth(this._month);
        return true;
    }

    public int getDay()
    {
        fixDay(_day);
        return _day;
    }

    public boolean setDay(int day)
    {
        switch ((this._month))
        {
            case 1:
                if(day < 1 || day > 31)
                {
                    System.out.println("The day doesn't match the month, on Jan we have 31 Days");
                    return false;
                }
                break;

            case 2:
                if(day < 1 || day > 28)
                {
                    System.out.println("The day doesn't match the month, on Feb we have 28 Days");
                    return false;
                }
                break;

            case 3:
                if(day < 1 || day > 31)
                {
                    System.out.println("The day doesn't match the month, on Mar we have 31 Days");
                    return false;
                }
                break;

            case 4:
                if(day < 1 || day > 30)
                {
                    System.out.println("The day doesn't match the month, on Apr we have 31 Days");
                    return false;
                }
                break;

            case 5:
                if(day < 1 || day > 31)
                {
                    System.out.println("The day doesn't match the month, on May we have 31 Days");
                    return false;
                }
                break;

            case 6:
                if(day < 1 || day > 30)
                {
                    System.out.println("The day doesn't match the month, on Jun we have 31 Days");
                    return false;
                }
                break;

            case 7:
                if(day < 1 || day > 31)
                {
                    System.out.println("The day doesn't match the month, on Jul we have 31 Days");
                    return false;
                }
                break;


            case 8:
                if(day < 1 || day > 31)
                {
                    System.out.println("The day doesn't match the month, on Aug we have 31 Days");
                    return false;
                }
                break;

            case 9:
                if(day < 1 || day > 31)
                {
                    System.out.println("The day doesn't match the month, on Sep we have 30 Days");
                    return false;
                }
                break;

            case 10:
                if(day < 1 || day > 31)
                {
                    System.out.println("The day doesn't match the month, on Cct we have 31 Days");
                    return false;
                }
                break;

            case 11:
                if(day < 1 || day > 31)
                {
                    System.out.println("The day doesn't match the month, on Nov we have 30 Days");
                    return false;
                }
                break;

            case 12:
                if(day < 1 || day > 31)
                {
                    System.out.println("The day doesn't match the month, on Dec we have 31 Days");
                    return false;
                }
                break;
            default:
                System.out.println("Your Month is Invalid , should set it before setting the day");
                return false;
        }

        this._day = day;
        return true;
    }

    private String fixDay (int day)  {
        if (day < 10)   {
            String format = String.format("%%0%dd", 2);
            String result = String.format(format, day);
            return result;
        }
        return Integer.toString(day);
    }

    private String fixMonth (int month)
    {
        if (month < 10)   {
            String format = String.format("%%0%dd", 2);
            String result = String.format(format, month);
            return result;
        }
        return Integer.toString(month);
    }

    public void show ()
    {
        System.out.print("The Date is: " + fixDay(this._day) + "/" + fixMonth(this._month) + "/" + _year);
    }

    public String getFullDate()
    {
        return "The Date is: " + fixDay(this._day) + " in  " + fixMonth(this._month) +  ", " + _year;
    }

    public void show (ShowOptions showOption)
    {
        if (showOption == ShowOptions.US) {
            System.out.print("US Version = The Date is: " + fixMonth(this._month) + "/" + fixDay(this._day) + "/" + _year);
        }
        else if (showOption == ShowOptions.Short) {
            System.out.print("Short Version = The Date is: " + fixDay(this._day) + "/" + fixMonth(this._month) + "/" + Integer.toString(_year).substring(2,4));
        }
        else {
            System.out.print("Reg Version = The Date is: " + fixDay(this._day) + "/" + fixMonth(this._month) + "/" + _year);
        }
    }

    public boolean valid()
    {
        if(setYear(_year)==false || setMonth(_month)==false || setDay(_day)==false)
        {
            System.out.println("The Date isn't Valid");
            return false;
        }
        System.out.println("The Date is Valid");
        return true;
    }

    public boolean similar(String date)
    {
        if (date.length() != 10)
        {
            System.out.println("The template need to be dd/mm/yyyy");
        }
        String fullDateOriginal;
        fullDateOriginal = fixDay(this._day) + "/" + fixMonth(this._month) + "/" + _year;
        if( date.equals(fullDateOriginal))
        {
            System.out.println("The given Date is equal to the object Date");
            return true;
        }
        System.out.println("The given Date is not equal");
        return false;
    }

    public boolean similar(String day,String month,String year)
    {
        if (day.length()+month.length()+year.length() != 8)
        {
            System.out.println("The template need to be dd/mm/yyyy");
        }
        String fixDaySim ;
        fixDaySim = fixDay(this._day);
        String fixMonthSim ;
        fixMonthSim = fixMonth(this._month);
        String fixYearSin ;
        fixYearSin = Integer.toString(this._year);

        if((day.equals(fixDaySim) && (month.equals(fixMonthSim)) && (year.equals(fixYearSin))))
        {
            System.out.println("The given Date is equal to the object Date");
            return true;
        }
        System.out.println("The given Date is not equal");
        return false;
    }

    public boolean similar (int day, int month, int year)
    {
        boolean result ;
        result = similar(Integer.toString(day),Integer.toString(month),Integer.toString(year));
        return result;
    }

    public boolean similar2 (DemoDate anotherDate)
    {
        boolean result;

        result = similar(anotherDate.toString());
        return result;
    }

    void clear()
    {
        setDay(1990);
        setMonth(1);
        setYear(1);
    }

    Boolean isBigger(DemoDate anotherDate ) {
        if ((anotherDate.toString().substring(0,2) == Integer.toString(this._day)) &&
                (anotherDate.toString().substring(3,5) == Integer.toString(this._month)) &&
                (anotherDate.toString().substring(6,8) == Integer.toString(this._year)))
        {
            return true;
        }
        return false;
    }



}
