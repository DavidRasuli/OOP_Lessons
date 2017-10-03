package Lesson7;

/**
 * Created by PC on 8/9/2017.
 */
public class FlyingSubmarineToy extends NitroToyCar {

    public boolean isNuclear() {
        return isNuclear;
    }

    public void setNuclear(boolean nuclear) {
        isNuclear = nuclear;
    }

    boolean isNuclear;


    public FlyingSubmarineToy() {
        super();
    }

    public FlyingSubmarineToy(int numberOfWheels, Color color,boolean isNuclear) {
        super(numberOfWheels, color);
        this.isNuclear = isNuclear;
    }

    @Override
    public void drive() {
        System.out.println("Flying Submarine Toy is swimming 30MPH in ze waterz, it has Nitro,may have nukes");
    }

    public void deployNukes()
    {
        if(isNuclear)
        {
            System.out.println("bombz");
        }
        else
        {
            System.out.println("you lucky sod");
        }
    }
}
