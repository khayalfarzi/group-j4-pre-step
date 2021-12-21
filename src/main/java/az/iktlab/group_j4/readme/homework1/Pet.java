package az.iktlab.group_j4.readme.homework1;

import java.util.Arrays;

public class Pet {

    public String species;
    public  String nickname;
    public int age;
    public byte trickLevel;
    public String [] habits;

    public Pet() {

    }

    public Pet(String species) {
        this.species = species;

    }

    public Pet(String species, String nickname, int age, byte trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void settrickLevel(byte trickLevel) {
       this.trickLevel = trickLevel;
    }
    public  String gettrickLevel() {

        if (trickLevel>50)
           return "very sly";
        else
            return "almost not sly";
    }

    public static void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.printf("Hello, owner. I am - %s . I miss you!", this.nickname);
    }
    public static void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return species +"{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}

