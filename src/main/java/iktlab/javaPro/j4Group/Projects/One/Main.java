//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package iktlab.javaPro.j4Group.Projects.One;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Human father = new Human("Taleh", "Ustayev", (short) 1970);
        Human mother = new Human("Xeyale", "Ustayev", (short) 1975);

        Family family = new Family(father, mother);
        System.out.println(family);
        family.addChild(new Human("Cavid", "Ustayev", (short) 1999));
        System.out.println(family);
        Human child = new Human("Gunay", "Ustayev", (short) 2003);
        family.deleteChild(child);
        // family.deleteChild(0);
        System.out.println(family);
    }
}
