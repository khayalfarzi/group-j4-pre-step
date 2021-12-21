package iktlab.group4.warmup;

import java.util.Arrays;

public class Pet {

    private String species;
    private String nickname;
    private int age;
    private int tricklevel;
    private String[] habits ;

    public Pet(String species, String nickname, int age, int tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(){
        System.out.println("Hello , Owner . I am " + this.nickname + ". I miss you");
    }

    public void foul(){
        System.out.println("I need to cover it up !!!");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
