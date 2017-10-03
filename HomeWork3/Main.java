package HomeWork3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int m, y, d;

        DemoDate demoDate = new DemoDate(1990,01,01);

        demoDate.valid();

        System.out.println("Enter Year ");
        setDataAndCheck('y',demoDate);
        System.out.println("Enter Month ");
        setDataAndCheck('m',demoDate);
        System.out.println("Enter Day ");
        setDataAndCheck('d',demoDate);


            demoDate.show();

            demoDate.getFullDate();

            System.out.println(demoDate.getFullDate());

            demoDate.show("SHORT");
            demoDate.show("US");
            demoDate.show("other");

            demoDate.valid();

            demoDate.similar("19/01/1995");

            demoDate.similar("18", "02", "1995");

            demoDate.similar(1995,19,02);

            //demoDate.similar2();



            //demoDate.isBigger(1990,01,01);
        }


    static public void setDataAndCheck (char type, DemoDate demoDate) {


        Scanner scanner = new Scanner(System.in);

        boolean success = false;
        do
        {
            try
            {
                System.out.println("Enter Value: ");
                int value = Integer.parseInt(scanner.nextLine());

                switch (type) {
                    case 'y':
                        success = demoDate.setYear(value);
                        break;
                    case 'm':
                        success = demoDate.setMonth(value);
                        break;
                    case 'd':
                        success = demoDate.setDay(value);
                        break;
                    default:
                        System.out.println("something went wrong");
                        break;
                }
            }
            catch (Exception e)
            {
                System.out.print("Invalid number. ");
                success = false;
            }
        }
        while (success == false);
    }
}
