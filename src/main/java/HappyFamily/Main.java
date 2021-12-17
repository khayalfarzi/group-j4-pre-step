package HappyFamily;

public class Main {

    public static void main(String[] args) {

        Human father = new Human("Vito", "Carlione", 1953);
        Human mother = new Human("Jane", "Carlione", 1952);
        Human child = new Human("John", "Carlione", 1980, 110,
                new Pet("dog", "Rock", 5, 65, new String[]{"eating", "playing"}),
                mother, father, new String[][]{{"reading book"}, {"playing football", "watching movie"}});

       System.out.println(child);
       child.greedPet();
       child.describePet();
       child.pet.eat();
       child.pet.respond();
       child.pet.foul();
       child.feedPet(false);
    }
}
