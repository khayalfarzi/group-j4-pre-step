package az.iktlab.happy_family_mini_project.step1;

public class Main {
    public static void main(String[] args) {
        Pet pet=new Pet("dog","Rock",(byte) 5,(byte) 75,new String[]{"eat", "drink", "sleep"});
        Human father=new Human("Vito","Karleone",(short) 1957);
        Human mother=new Human("Jane","Karleone",(short) 1959);
        Human child=new Human("Michael","Karleone",(short) 1977,(byte) 90,mother,father,pet);

        System.out.println(father);


    }
}
