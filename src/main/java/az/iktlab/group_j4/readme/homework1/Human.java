package az.iktlab.group_j4.readme.homework1;

import java.util.Random;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public  static Pet petobj;
    public  Human mother;
    public Human father;
    public String [][] schedule;
    public Human child;

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

    public Human(String name, String surname, int year, int iq, Human mother, Human father, Human child, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.child = child;
        this.schedule = schedule;
    }

    public static void greetPet(){
        System.out.printf("Hello, owner. I am - %s . I miss you!", petobj.nickname);
    }

    public static void describePet(){
        System.out.printf("I have a %s . he is  %d years old, he is %s ", petobj.species, petobj.age, petobj.gettrickLevel());
    }

    public boolean feedPet(Boolean eatTime){
        if (eatTime)
            return true;
        else {
            Random rd = new Random(0-100);
            byte rdTrickLevelNum = (byte) rd.nextInt();
            return (rdTrickLevelNum > petobj.trickLevel)?true:false;
        }
    }

    @Override
    public String toString() {
        return "human{" +
                "name='" + name +
                ", surname='" + surname +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother.name +" "+mother.surname+
                ", father=" + father.name +" "+father.surname+
                ",  child=" + child.name +
                ", pet=" + petobj.toString() +
                '}';
    }
}

