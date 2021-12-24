package az.iktlab.groupJ4.JavaLessons.HappyFamily;

public class Main {
    public static void main(String[] args) {
        Human father = new Human("Elmar", "Memmedov", (short) 1960);
        Human mother = new Human("Gulnar", "Memmedova", (short) 1955);
        System.gc();
        Family family = new Family(father, mother);
        System.out.println(family);
        System.gc();
        family.addChild(new Human("Huseyn", "Memmedov", (short) 1985));
        System.out.println(family);
        Human child = new Human("Huseyn", "Memmedov", (short) 1985);
        family.deleteChild(child);
        System.out.println(family);
        System.gc();



        Human human = new Human("Nicat", "Guliyev", (short) 1993, (byte) 100, new String[][]{{DaysOfWeek.Monday.name(), "Footbal"},
                {DaysOfWeek.Tuesday.name(), "Reading"}});

        Pet pet = new Pet(Species.Dog, "Rock");
        System.out.println(pet);

    }

}
