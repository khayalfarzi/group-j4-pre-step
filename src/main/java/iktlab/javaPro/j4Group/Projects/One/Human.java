//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package iktlab.javaPro.j4Group.Projects.One;

import java.util.Arrays;

public class Human {
    public String getName() {
        return name;
    }

    public Human(String name,String surname){
        this.name=name;
    }


    public String getSurname() {
        return surname;
    }

    public short getDateOfbirth() {
        return dateOfbirth;
    }

    private String name;
    private String surname;
    private short dateOfbirth;
    private byte iq;
    static Pet pet = new Pet();
    private Human mother;
    private Human father;
    private String[][] schedule;

    public byte getIq() {
        return iq;
    }

    public static Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfbirth(short dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public void setIq(byte iq) {
        this.iq = iq;
    }

    public static void setPet(Pet pet) {
        Human.pet = pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }



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
