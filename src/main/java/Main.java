public class Main {

    public static void main(String[] args) {

      Human mother =new Human("Jane","Karleone",80);
      Human father = new Human("Vito","Karleone",81);

      Pet pet = new Pet("dog","Rock",5,75, new String[]{"eat,drink,sleep"});

      Human child = new Human("Michael","Karleone",1977,90,pet,mother,father,new int[7][]);


        System.out.println(child);

    }
}
