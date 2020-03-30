package Animal;

public class Lion extends Feline{
    public Lion(String name) {
        super(name);
    }
    public int numberOfLegs;



    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void eat() {
        System.out.println("Lions eat meat");
    }

}
