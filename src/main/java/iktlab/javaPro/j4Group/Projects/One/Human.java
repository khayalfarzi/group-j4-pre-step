//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package iktlab.javaPro.j4Group.Projects.One;

import java.util.Arrays;

public class Human {
    public String name;
    public String surname;
    public short dateOfbirth;
    public byte iq;
    static Pet pet = new Pet();
    public Human mother;
    public Human father;
    public String[][] schedule;

    public void greetPet() {
        System.out.printf("Hello,  %s" + pet.nickname);
    }

    public void describePet() {
        String sly = pet.tricklevel >= 50 ? "very sly" : "almost not sly";
        System.out.printf("I have a %s, he is %s years old, he is %s", pet.species, pet.age, sly);
    }

    public String toString() {
        return "Human{name='" + this.name + '\'' + ", surname='" + this.surname + '\'' + ", dateOfbirth=" + this.dateOfbirth + ", iq=" + this.iq + ", mother=" + this.mother + ", father=" + this.father + ", schedule=" + Arrays.toString(this.schedule) + '}';
    }

    public Human() {
    }

    public Human(String name, String surname, short dateOfbirth) {
    }

    public Human(String name, String surname, short dateOfbirth, byte iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfbirth = dateOfbirth;
        this.iq = iq;
        Human.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }
}
