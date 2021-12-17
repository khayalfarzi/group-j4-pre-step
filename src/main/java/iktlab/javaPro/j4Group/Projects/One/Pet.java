package iktlab.javaPro.j4Group.Projects.One;

import static iktlab.javaPro.j4Group.Projects.One.Human.pet;

public class Pet {
    public String species;
    public String  nickname;
    public int age;
    public int tricklevel;
    public String[] habits = new String[5];

    static void eat(){
        System.out.println("I am Eating");
    }

    static void  respond(){

        System.out.println("Hello, owner. I am "+ pet.nickname+". I miss you");
    }
    static void foul(){
        System.out.println("I need to cover it up");
    }




}
