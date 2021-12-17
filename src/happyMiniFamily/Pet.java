package happyMiniFamily;

public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;

    public Pet() {
    }

    //method eat
    public void eat() {
        System.out.println("I am eating");
    }

    //method respond
    public void respond() {
        System.out.println("Hello, owner. I am - [the name of the pet]. I miss you!");
    }
    // method foul
    public void foul() {
        System.out.println("I need to cover it up");
    }


}
