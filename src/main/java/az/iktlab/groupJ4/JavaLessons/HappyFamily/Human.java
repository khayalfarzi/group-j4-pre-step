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
        System.out.println(String.format("Hello, %s", pet.getNickname()));
    }

    public void describePet(){
        String sly="";
        if (pet.getTrickLevel()>50){
            sly="very sly";
        }else{sly="almost not sly";}
        System.out.printf("I have a %s, he is %s years old, he is %s",pet.getSpecies(),pet.getAge(),sly);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public short getYear(){
        return year;
    }
    public void setYear(short year){
        if (year<=0)
            System.out.print("year must be greater than zero");
        this.surname= surname;
    }

    public byte getIq() {
        return iq;
    }

    public void setIq(byte iq) {
        if (iq<0)
            System.out.println("iq can not get a negative value");
        this.iq = iq;
    }

    public Pet getPet(){
        return pet;
    }
    public void setPet(Pet pet){
        this.pet = pet;
    }

    public Human getMother(){
        return mother;
    }
    public void setMother(Human mother){
        this.mother = mother;
    }

    public Human getFather(){
        return father;
    }
    public void setFather(Human father){
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
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
