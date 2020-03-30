package Animal;

public class Tiger extends Feline {
    public Tiger(String name) {
        super(name);
    }
    public int numberOfLegs;



    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void eat() {
        System.out.println("Tigers eat meat");
    }




}
