package HappyFamily;

import java.util.Arrays;

public class Human {
    public String name;
    public  String surname;
    public  int year;
    public int IQ;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;


    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int IQ, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greedPet(){
        System.out.println("Hello " + pet.nickname);
    }

    public void describePet(){
        String sly = "";
        if(pet.trickLevel>50){
            sly = "very sly";
        }else{
            sly = "not sly";
        }
        System.out.println("I have " + pet.species + ". He is " + pet.age + " years old, he is " + sly);
    }

    public boolean feedPet(boolean isIttime){
        if(isIttime){
            System.out.println("Hm... I will feed Jack's " + pet.nickname);
            return true;
        }
        else{
            if(pet.trickLevel >= Math.random()*100){
                System.out.println("Hm... I will feed " + pet.nickname);
                return true;
            }
            else {
                System.out.println("I think " + pet.nickname + " is not hungry");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", IQ=" + IQ +
                ", mother=" + mother.name + " " + mother.surname +
                ", father=" + father.name + " " + father.surname +
                ", pet = "  + pet +
                '}';
    }
}
