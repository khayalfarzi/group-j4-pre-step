public class main {
    public static void main(String[] args) {
        pet p = new pet();
        p.species = "dog";
        p.nickname = "Rock";
        p.age = 5;
        p.trickLevel = 75;
        p.habits = new String[]{"eat", "drink", "sleep"};
        human h = new human();
        h.name = "Michael";
        h.surname = "Karleone";
        h.year = 1977;
        h.iq = 90;
        human m = new  human();
        m.name = "Jane";
        m.surname = "Karleone";
        h.mother = m;
        human f = new  human();
        f.name = "Vito";
        f.surname = "Karleone";
        h.father = f;
        h.petobj =p;

        System.out.println(h.toString());
    }
}
