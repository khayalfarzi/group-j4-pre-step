package az.iktlab.happy_family_mini_project.step1;

import java.util.Arrays;

public class Human {

    public String name;
    public String surname;
    public short year;
    public byte iq;
    Pet pet;
    Human mother;
    Human father;
    public String[][] schedule;

    public Human() {

    }

    public Human(String name, String surname, short year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    public Human(String name, String surname, short year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;

    }

    public Human(String name, String surname, short year, byte iq, Human mother, Human father,Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public void greedPed() {
        System.out.printf("hello,%s", pet.nickname);
    }

    public void describePed() {
        String sly = "";
        if (pet.trickLevel > 50) {
            sly = "very sly";
        } else {
            sly = "almost not sly";
        }
        System.out.printf("I have %s, He is %s years old, he is %s", pet.species, pet.age, sly);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}


