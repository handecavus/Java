package Gun37._02_Soru;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {

        Cat c=new Cat();
        Duck d=new Duck();
        Shark sh=new Shark();
        Swallow sw=new Swallow();

        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(c);
        animals.add(d);
        animals.add(sh);
        animals.add(sw);

        for (Animal a: animals) {
            System.out.println("------------------------");
            System.out.println(a.getClass().getSimpleName());
            System.out.println("------------------------");

            if (a instanceof Cat) {
                System.out.println(((Cat) a).food());
            } else if (a instanceof Duck) {
                System.out.println(((Duck) a).food());
                System.out.println(((Duck) a).flying());
                System.out.println(((Duck) a).sailing());
            } else if (a instanceof Shark) {
                System.out.println(((Shark) a).food());
                System.out.println(((Shark) a).sailing());
            } else if (a instanceof Swallow) {
                System.out.println(((Swallow) a).food());
                System.out.println(((Swallow) a).flying());
            }
        }
    }
}
