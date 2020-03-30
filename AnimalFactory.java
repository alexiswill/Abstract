package Animal;

import Animal.Animal;

public class AnimalFactory {

    public static void main(String[] args) {

        Dog dog1 = new Dog("fido");
        dog1.numberOfLegs = 4;
        dog1.eat();

        Cat cat1 = new Cat("felix");
        System.out.println(cat1.numberOfLegs = 3);

        RoboDog roboDog = new RoboDog();

    }
}
