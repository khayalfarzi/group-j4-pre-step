package az.iktlab.group_j4.readme.homework1;

import java.time.MonthDay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pet p = new Pet("dog", "Rock", 5, (byte) 100, new String[]{"eat", "drink", "sleep"});
        //Pet p1 = new Pet("cat", "Joysi", 9, (byte) 80, new String[]{"game", "drink", "sleep"});
        Pet p2 = new Pet("cat", "Merci", 2, (byte) 100, new String[]{"jumping", "walking", "sleep"});
        //Pet p3 = new Pet("Rabbit", "Rob", 3, (byte) 15, new String[]{"game", "drink", "sleep"});


        Human h = new Human("Michael", "Karleone", 1977);
        Human m = new  Human("Jane", "Karleone", 1960);
        Human f = new  Human( "Vito", "Karleone", 1659);
        Human c = new Human("Asker", "Karleone", 1990);

        h.father = f;
        h.mother = m;
        h.petobj =p;
        h.child = c;
        c.father=h;

        Human h1 = new Human("Nigar", "Rzayeva", 1987);
        Human m1 = new  Human("Lata", "Aliyeva", 1965);
        Human f1 = new  Human( "Farac", "Rzayev", 1655);


        h1.father = f1;
        h1.mother = m1;
        h1.petobj =p;
        h1.child = c;
        c.mother=h1;

        Human h2 = new Human("Reshad", "Askerov", 1982);
        Human m2 = new  Human("Shefeq", "Recebova", 1965);
        Human f2 = new  Human( "Hashim", "Askerov", 1655);
        Human c2 = new Human("Tomi", "Askerov", 2011);

        h2.father = f2;
        h2.mother = m2;
        h2.petobj =p2;
        h2.child = c2;


        System.out.println(h.toString());
        System.out.println(h1.toString());
        System.out.println(h2.toString());

        System.out.printf("Is it time to feed %s (Y/N):",p.nickname );
        Scanner sc = new Scanner(System.in);
        String feedTime = sc.nextLine();
        if(h.feedPet((feedTime == "Y")?Boolean.TRUE:Boolean.FALSE)){
            System.out.printf("Hm... I will feed %s ",p.nickname);
        }else{
            System.out.printf("I think %s is not hungry.",p.nickname);
        }
    }


}
