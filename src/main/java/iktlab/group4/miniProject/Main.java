package iktlab.group4.lesson11;

public class Main {

    public static void main(String[] args) {


        String[] habits = {"qacamq" , "uzmek " , "hurmek"};

        Pet hatiko =  new Pet("it" , "hatiko" , 11 , 95 , habits );


        Human jane = new Human("Jane" , "Carter" , 1995 );
        Human bob = new Human("Bob" , "Carter" , 1995 );


        Human jake =  new Human("Jake" , "Carter" , 1997 , 99 , hatiko , jane , bob);


        jake.describePet();
        jake.greetPet();

        hatiko.eat();
        hatiko.respond();

        System.out.println(bob);
        System.out.println(hatiko);

    }

}
