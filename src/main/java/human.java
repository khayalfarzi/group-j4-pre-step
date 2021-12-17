public class human {


    public String name;
    public String surname;
    public int year;
    public byte iq;
    public  static pet petobj;
    public  human mother;
    public  human father;
    public String [][] schedule;

    public static void greetPet(){
        System.out.println("Hello, owner. I am - " + petobj.nickname + " . I miss you!");
    }
    public static void describePet(){
        System.out.println("I have a " + petobj.species + ",he is  " + petobj.age + " years old, he is "+ (petobj.trickLevel>50?"very sly":"almost not sly")+" ");
    }

    @Override
    public String toString() {
        return "human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother.name +" "+mother.surname+
                ", father=" + father.name +" "+father.surname+
                ", pet=" + petobj.toString() +
                '}';
    }
}
