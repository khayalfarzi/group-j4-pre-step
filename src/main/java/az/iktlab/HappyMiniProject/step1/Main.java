package az.iktlab.HappyMiniProject.step1;

public class Main {
    public static void main(String[] args) {
        Pet Rock = new Pet("dog", "Rock", (byte) 5, (byte) 75,
                new String[]{"eat", "drinlk", "sleep"});
        System.out.println(Rock);
        Human Vito = new Human("Vito", "Karleone", (short) 1957);
        Human Jane = new Human("Jane", "Karleone", (short) 1958);
        Human Michael = new Human("Michael", "Karleone", (short) 1977, (byte) 90,
                Rock, Jane, Vito,null);
        System.out.println(Michael);
    }

}
