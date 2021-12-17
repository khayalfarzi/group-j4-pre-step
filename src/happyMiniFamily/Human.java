package happyMiniFamily;

public class Human {
    String name;
    String surname;
    long year;
    int iq;

    Pet pet= new Pet();
    Human mother = new Human();
    Human father= new Human();
    //methods for Human
    public void greetPet() {
        System.out.println("Hello" + pet.nickname);
    } public void describePet(){
            System.out.println("I have a "+ pet.species+ ", he is"+ pet.age+ "years old,he is ");
    }



}
