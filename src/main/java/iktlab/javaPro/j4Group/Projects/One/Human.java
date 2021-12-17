package iktlab.javaPro.j4Group.Projects.One;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    static Pet pet = new Pet();
    public Human mother = new Human();

    public Human father = new Human();
    public String[][] schedule = new String[7][];
    static void greetPet(){
        System.out.println("Hello, "+ pet.nickname);
    }
    static void describePet(){
        System.out.print("I have a "+pet.species);
        System.out.print(", he is "+pet.age);
        if (pet.tricklevel>50){
            System.out.print(", he is very sly ");
        }
        else {
            System.out.print(", he is almost not sly ");
        }

    }


    }


