package az.iktlab.groupJ4.JavaLessons.HappyFamily;

public class Human {
    public String name;
    public  String surname;
    public  short year;
    public byte IQ;
    public Pet pet;
    public Human mother;
    public Human father;
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

    public Human(String name, String surname, short year, byte IQ, Pet pet, Human mother, Human father, String[][] schedule) {
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
        System.out.println(String.format("Hello %s", pet.nickname));
    }

    public void describePet(){
        String sly = "";
        if(pet.trickLevel>50){
            sly = "very sly";
        }else{
            sly = "not sly";
        }
        System.out.println(String.format("I have %s. He is %s years old, he is %s", pet.species, pet.age, sly));

    }

    public boolean feedPet(boolean isIttime){
        if(isIttime){
            System.out.println(String.format("Hm.. I will feed %s.", pet.nickname));
            return true;
        }
        else{
            if(pet.trickLevel >= Math.random()*100){
                System.out.println(String.format("Hm.. I will feed %s.", pet.nickname));
                return true;
            }
            else {
                System.out.println(String.format("I think %s is not hungry", pet.nickname));
                return false;
            }
        }
    }

    @Override
    public String toString() {

        return String.format("Human{name = %s, surname = %s, year = %s," +
                " IQ = %s, mother = %s %s, father = %s %s, pet = %s", name, surname, year, IQ,
                mother.name, mother.surname,
                father.name, father.surname, pet);
    }
}
