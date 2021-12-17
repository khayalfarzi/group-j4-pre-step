package iktlab.group4.warpup;

public class Human {

    private String name ;
    private String surname;
    private int dob ;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;

    public Human(String name, String surname, int dob, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public Human(String name, String surname, int dob, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.mother = mother;
        this.father = father;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDob() {
        return dob;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public void greetPet(){
        System.out.println("hello , " + this.pet.getNickname());
    }

    public void describePet(){
        String str ;
        if (this.pet.getTricklevel() > 50){
            str = " very sly ";
        }else{
            str = " almost not sly " ;
        }
        System.out.println("I have a " +this.pet.getSpecies() + " , he is " + this.pet.getAge() + " years old , he is " + str);
    }

    @Override
    public String toString() {
        return this.name +" " + this.surname;
    }
}
