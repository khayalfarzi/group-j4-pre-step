package az.iktlab.groupJ4.JavaLessons.HappyFamily;

public class Main {
    public static void main(String[] args) {
        Pet rock = new Pet("dog", "Rock", (byte)5, (byte)75, new String[]{"eat", "drink", "sleep"});
        /*System.out.println(rock);
        rock.eat();
        rock.respond();
        rock.foul();*/
        Human jane = new Human("Jane", "Karleone", (short)1960);
        Human vito = new Human("Vito", "Karleone", (short)1965);
        Human micheal = new Human("Michael", "Karleone", (short)1977, (byte)90, rock, jane, vito,
                new String[][]{{"reading book"}, {"playing football", "watching movie"}});
        // System.out.println(micheal);
        micheal.greetPet();
        micheal.describePet();
    }

}
