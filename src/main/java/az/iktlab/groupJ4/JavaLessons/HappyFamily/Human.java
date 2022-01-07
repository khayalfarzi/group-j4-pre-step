package az.iktlab.groupJ4.JavaLessons.HappyFamily;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private short year; //date of birth (year), number
    private byte iq; //a whole number from 1 to 100
    private Pet pet; //object type Pet
    private Human mother; //object type Human
    private Human father; //object type Human
    private String [][]schedule;

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

    public Human(String name, String surname, short year, byte iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println(String.format("Hello, %s", pet.nickname));
    }

    public void describePet(){
        String sly="";
        if (pet.trickLevel>50){
            sly="very sly";
        }else{sly="almost not sly";}
        System.out.printf("I have a %s, he is %s years old, he is %s",pet.species,pet.age,sly);
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
