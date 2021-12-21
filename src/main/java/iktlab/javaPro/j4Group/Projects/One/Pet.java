//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package iktlab.javaPro.j4Group.Projects.One;

import java.util.Arrays;

public class Pet {
    public String species;
    public String nickname;
    public byte age;
    public int tricklevel;
    public String[] habits;

    public void eat() {
        System.out.println("I am Eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am %s. I miss you", Human.pet.nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public String toString() {
        return "Pet{species='" + this.species + '\'' + ", nickname='" + this.nickname + '\'' + ", age=" + this.age + ", tricklevel=" + this.tricklevel + ", habits=" + Arrays.toString(this.habits) + '}';
    }

    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, byte age, byte tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }
}
