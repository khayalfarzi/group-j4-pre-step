import java.util.Random;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq; // 1-100
    private  Human mother;
    private  Human father;
    private Pet pet;
    private int [][] schedule ;


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

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, int[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
//        this.iq = iq;
        if(iq>0 && iq<101) {
            this.iq = iq;
        }else{
            this.iq=0;
        }
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.schedule = schedule;
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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if(iq>0 && iq<101) {
            this.iq = iq;
        }else{
            this.iq=0;
        }
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public int[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(int[][] schedule) {
        this.schedule = schedule;
    }



    public void greetPet(){

        System.out.println("Hello " + pet.getNickname());
    }

    public void describePet(){

        if(pet.getTrickLevel()>50){
            System.out.println("I have a " + pet.getSpecies() +", he is " + pet.getAge() + " years old, he is very sly");
        }
        else{
            System.out.println("I have a " + pet.getSpecies() +", he is " + pet.getAge() + " years old, he is almost not sly");
        }
    }


    public void feedPet(boolean feedTime){

        Random random = new Random();
        if(!feedTime){

            System.out.println("isn't it time for feeding ");

        }else{

            if(pet.getTrickLevel()>random.nextInt(100)){

                System.out.println("Hm... I will feed Jack's " + pet.getNickname());
            }else{

                System.out.println("I think " +  pet.getSpecies()  + " is not hungry");
            }


        }


    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                '}';
    }
}
