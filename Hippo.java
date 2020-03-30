package Animal;

public class Hippo extends Animal {
    public Hippo(String name) {
        super(name);
    }
    public int numberOfLegs;


    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void eat() {
        System.out.println("Hippos eat fish");
    }



}
