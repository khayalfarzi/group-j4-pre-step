package az.iktlab.groupJ4.JavaLessons.HappyFamily;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private byte age;
    private byte trickLevel; //a whole number from 1 to 100
    private String []habits; //array of strings

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
        System.out.println(String.format("Hello, owner. I am - %s. I miss you!", nickname));
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species){
        this.species = species;
    }

    public String getNickname(){
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public byte getAge(){
        return age;
    }
    public void setAge(byte age){
        if(age <= 0)
            System.out.println("age can not get a negative value");
        else
            this.age = age;
    }

    public byte getTrickLevel(){
        return trickLevel;
    }
    public void setTrickLevel(byte trickLevel){
        if(trickLevel < 0)
            System.out.println("trickLevel cannot be less than zero");
        else
            this.trickLevel = trickLevel;
    }

    public String[] getHabits(){
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }
    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
