package Animal;

public class Wolf extends Canine{
    public Wolf(String name) {
        super(name);
    }

    public int numberOfLegs;




    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void eat() {
        System.out.println("Wolves eat meat");
    }

}
