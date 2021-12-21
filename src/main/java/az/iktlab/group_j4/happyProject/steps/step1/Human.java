package az.iktlab.group_j4.happyProject.steps.step1;

import java.util.Random;

public class Human {

    Random random = new Random();

    public String name;
    public String surname;
    public short year;
    public byte iq;
    public Human mother;
    public Human father;
    public Pet pet;
    public String schedule[][];


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

    public Human(String name, String surname, short year, byte iq, Human mother, Human father, Pet pet, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.schedule = schedule;
    }

    public void greetPet() {

        System.out.printf("Hello, %s", pet.nickname);

    }

    public void describePet() {


        if (pet.trickLevel > random.nextInt(100)) {

            System.out.printf("I have a %s, he is %d years old, he is very sly", pet.species, pet.age);
        } else {
            System.out.printf("I have a %s, he is %d years old, he is almost not sly", pet.species, pet.age);
        }

    }

    public boolean feedPet(boolean feedTime) {

            if(!feedTime && pet.trickLevel < random.nextInt(100)){

                    System.out.println("I think Jack's animal is not hungry");

                    return false;
                }else{


                    System.out.printf("Hm... I will feed Jack's %s ",pet.nickname);

                    return true;
                }


    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + (mother ==null ? "unknown" : mother.name + " " + mother.surname )+
                ", father=" + (father==null ? "unknown" : father.name + " " + father.surname) +
                ", pet=" + (pet==null ? "unknown" : pet) +
                '}';
    }
}
