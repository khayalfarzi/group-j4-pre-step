package az.iktlab.group_j4.happyProject.steps.step1;

public class Main {

    public static void main(String[] args) {


        Human jane = new Human("Jane", "Karleone", (short) 1940);
        Human vito = new Human("Vito", "Karleone", (short) 1939);
        Pet pet = new Pet("dog", "Rock", (byte) 5, (byte) 50, new String[]{"eat", "drink", "sleep"});
        Human michael = new Human("Michael","Karleone",(short)1977,(byte)90,jane,vito,pet,new String[][]{{" "},{" "}});


        System.out.println(vito
        );
//
//        Michael.describePet();
//        Michael.greetPet();
//
//        pet.respond();
//        pet.foul();
//        pet.eat();


    }

}
