package Lesson7;

import java.util.ArrayList;

/**
 * Created by PC on 8/9/2017.
 */
public class mainClass {

    public static void main(String []args) {

        ArrayList<ToyCar> toys = new ArrayList<ToyCar>();
        toys.add(new ToyCar(4,Color.Blue));
        toys.add(new NitroToyCar());
        toys.add(new FlyingSubmarineToy(2,Color.Purple,false));
        toys.add(new NitroToyCar());
        toys.add(new FlyingSubmarineToy());

        if(toys.get(4) instanceof  FlyingSubmarineToy) {
            FlyingSubmarineToy fst = (FlyingSubmarineToy) toys.get(4);
            fst.setNuclear(true);
        }

        for(ToyCar toy : toys)
        {
            toy.drive();
            try
            {
                NitroToyCar n = (NitroToyCar)toy;
                n.nitro();
                FlyingSubmarineToy f = (FlyingSubmarineToy)n;
                f.deployNukes();
            }
            catch(Exception e)
            {

            }
        }



    }

}