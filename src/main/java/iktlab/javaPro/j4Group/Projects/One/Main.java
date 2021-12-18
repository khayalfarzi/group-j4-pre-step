//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package iktlab.javaPro.j4Group.Projects.One;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Pet Rock = new Pet("dog", "Rock", (byte)5, (byte)75, new String[]{"eat", "drink", "sleep"});
        System.out.println(Rock);
        Human Vito = new Human("Vito", "Karleone", (short)1957);
        Human Jane = new Human("Jane", "Karleone", (short)1958);
        Human Michael = new Human("Michael", "Karleone", (short)1977, (byte)90, Rock, Jane, Vito, (String[][])null);
        System.out.println(Michael);
    }
}
