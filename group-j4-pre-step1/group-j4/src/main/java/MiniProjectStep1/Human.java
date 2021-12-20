package MiniProjectStep1;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    short year;
    byte iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;
    public Human() {}
    public Human(String name, String surname, short year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, short year,byte iq, Human mother, Human father,Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public void greetPet(){
        System.out.printf("Hello, %s",pet.nickname);
    }
    public void describePet(){
        String sly= pet.tricklevel>50?"very sly":"almost not sly";
        System.out.printf("I have a %s, he is %f years old, he is %s",pet.species,pet.age,sly);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                '}';
    }

}
