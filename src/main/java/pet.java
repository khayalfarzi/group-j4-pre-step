import java.util.Arrays;

public class pet {
    public String species;
    public  String nickname;
    public byte age;
    public byte trickLevel;
    public String [] habits;
    public static void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("Hello, owner. I am - " + this.nickname + " . I miss you!");
    }
    public static void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return species +"{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
