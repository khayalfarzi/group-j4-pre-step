package MiniProjectStep1;

public class Main {
    public static void main(String[] args) {
        Pet pet= new Pet("dog","Mortal",(short) 4,(byte) 80,new String[]{"eat","drink","sleep"});
       Human Vito= new Human("Vito","Carleone", (short) 1955);
       Human Jane= new Human("Jane","Carleone", (short) 1957);
       Human child= new Human("Michael", "Carleone",(short) 1977,(byte) 87,Jane,Vito,pet);

        System.out.println(Vito);


    }
}
