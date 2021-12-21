package az.iktlab.group_j4.happyProject.steps.step1;


import java.util.Arrays;

public class Pet {

    public String species;
    public String nickname;
    public byte age;
    public byte trickLevel;
    public String[] habits;


    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, byte age, byte trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        if (trickLevel > 1 && trickLevel < 100) {
            this.trickLevel = trickLevel;
        } else {

            System.out.println("Wrong Tricklevel");
            this.trickLevel = 0;
        }

        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {

        System.out.printf("Hello, owner. I am - %s I miss you!", nickname);

    }

    public void foul() {
        System.out.println("I need to cover it up");
    }


    @Override
    public String toString() {
        return species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel  +
                ", habits=" + (habits==null ? "unknown" : Arrays.toString(habits) ) +
                '}';
    }
}
