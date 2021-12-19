package az.iktlab.happyMiniProject.step1;

public class Human {
    public String name;
    public String surname;
    public short dateOfBirth;
    public byte iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, short dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, short dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }


    public Human(String name, String surname, short dateOfBirth, byte iq, Pet pet,
                 Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }


    public void greetPed() {
        System.out.printf("Hello, %s", pet.nickname);
    }

    public void describePet() {
        String slyDegree = pet.trickLevel >= 50 ? "very sly" : "almost not sly";
        System.out.printf("I have a %s, he is %s years old, he is %s", pet.species, pet.age, slyDegree);

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", DateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }


}
