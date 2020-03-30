package Animal;

public abstract class Robot {

    private String name;
    protected Integer numberOfLegs;

    public Robot(String name){
        this.name = name;
    }

    public Robot() {

    }

    public String getName(){
        return name;
    }


}
