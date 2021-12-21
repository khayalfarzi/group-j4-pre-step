//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package iktlab.javaPro.j4Group.Projects.One;

import java.util.Arrays;

public class Pet {
    String species;

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setTricklevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public byte getAge() {
        return age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public String[] getHabits() {
        return habits;
    }

    String nickname;
    byte age;
    int tricklevel;
    private String[] habits;

    private void eat() {
        System.out.println("I am Eating");
    }

    private void respond() {
        System.out.printf("Hello, owner. I am %s. I miss you", Human.pet.nickname);
    }

    private void foul() {
        System.out.println("I need to cover it up");
    }

    public String toString() {
        return "Pet{species='" + this.species + '\'' + ", nickname='" + this.nickname + '\'' + ", age=" + this.age + ", tricklevel=" + this.tricklevel + ", habits=" + Arrays.toString(this.habits) + '}';
    }

    Pet() {
    }

    private Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    Pet(String species, String nickname, byte age, byte tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }
}
