package HomeWork6;

public class Main {

    public static void main(String[] args) {

        DemoDateTime demoDateTime = new DemoDateTime();
        DemoDateTime demoDateTime1 = new DemoDateTime(1988,7,16,1,1,1);
        demoDateTime1.getFullDate();
        System.out.println(demoDateTime1.getFullDate());
        demoDateTime1.show();
        demoDateTime1.show(ShowOptions.Short);
        demoDateTime1.show(ShowOptions.US);
        demoDateTime.valid();

    }
}