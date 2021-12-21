package az.iktlab.groupJ4.JavaLessons.HappyFamily;

public class Main {
    public static void main(String[] args) {
        Human father = new Human("Elmar", "Memmedov", (short) 1960);
        Human mother = new Human("Gulnar", "Memmedova", (short) 1955);

        Family family = new Family(father, mother);
        System.out.println(family);
        family.addChild(new Human("Huseyn", "Memmedov", (short) 1985));
        System.out.println(family);
        Human child = new Human("Huseyn", "Memmedov", (short) 1985);
        family.deleteChild(child);
       // family.deleteChild(0);
        System.out.println(family);

    }

}
