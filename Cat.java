package Animal;

public class Cat extends Feline implements IPet {
    public int numberOfLegs;
    private String name;

    public Cat(String name) {
            super(name);
        }

        public String getName(){
        return name;
        }

        @Override
        public void eat() {
            System.out.println("cats eat mice");
        }

    public void greet() {
        
    }
}


