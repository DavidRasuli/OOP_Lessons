package Lesson7;

/**
 * Created by PC on 8/9/2017.
 */
public class NitroToyCar extends ToyCar {



    public NitroToyCar() {
        super();
    }

    public NitroToyCar(int numberOfWheels, Color color) {
        super(numberOfWheels,color);
    }

    public void drive()
    {
        System.out.println("Toy car is driving 20MPH, it has Nitro");
    }

    public void nitro()
    {
        System.out.println("Nitro is on");
    }

}
