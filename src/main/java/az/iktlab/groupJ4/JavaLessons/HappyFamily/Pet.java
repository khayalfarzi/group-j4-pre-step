package az.iktlab.groupJ4.JavaLessons.HappyFamily;

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
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(){
        System.out.println(String.format("Hello owner. I am %s. I miss you", nickname));
    }

    public void foul(){
        System.out.println("I need cover it up");
    }

    @Override
    public String toString() {
        return String.format("%s{nickname = %s, age = %s, trickLevel = %s, habits = %s}",
                species, nickname, age, trickLevel, Arrays.toString(habits));

    }
}
