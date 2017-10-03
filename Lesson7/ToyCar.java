package Lesson7;

/**
 * Created by PC on 8/9/2017.
 */
public class ToyCar {

    int numberOfWheels;

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    Color color;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public Color getColor() {
        return color;
    }

    public ToyCar(int numberOfWheels, Color color) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    public ToyCar() {
        this(4,Color.Blue);
    }

    public void drive()
    {
        System.out.println("Toy car is driving 10MPH");
    }

}