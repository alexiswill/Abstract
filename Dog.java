package Animal;

import Animal.Canine;
import Animal.IPet;

public class Dog extends Canine implements IPet {
    public int numberOfLegs;

    public Dog(String name) {
        super(name);
        }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
        public void eat() {
            System.out.println("dogs eat bones");
        }

    public void greet() {
        System.out.println("Licks my feet and wags tail");
    }
}




