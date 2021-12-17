package happyMiniFamily;

public class Main {
    public static void main(String[] args) {

        class Human {
            String name;
            String surname;
            byte year;
            int iq;

            Pet pet= new Pet();
            happyMiniFamily.Human mother = new happyMiniFamily.Human();
            happyMiniFamily.Human father= new happyMiniFamily.Human();
            //methods for Human
            public void greetPet(){
                System.out.println("Hello"+ pet.nickname);
            }



        }

    }
}
