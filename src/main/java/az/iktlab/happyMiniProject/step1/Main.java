package az.iktlab.happyMiniProject.step1;

public class Main {
    public static void main(String[] args) {
        Pet rock = new Pet("dog", "Rock", (byte) 5, (byte) 75,
                new String[]{"eat", "drinlk", "sleep"});
        System.out.println(rock);
        Human vito = new Human("Vito", "Karleone", (short) 1957);
        Human jane = new Human("Jane", "Karleone", (short) 1958);
        Human michael = new Human("Michael", "Karleone", (short) 1977, (byte) 90,
                rock, jane, vito, null);
        System.out.println(michael);
    }

}
