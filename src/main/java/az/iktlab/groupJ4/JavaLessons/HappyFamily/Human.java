package az.iktlab.groupJ4.JavaLessons.HappyFamily;

import java.util.Arrays;
import java.util.Objects;

enum DaysOfWeek{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

public class Human {
    private String name;
    private String surname;
    private short year;
    private byte IQ;
    private Family family;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, short year) {
        if(year < 0){
            System.out.println("Enter valid year");
        }
        else{
            this.name = name;
            this.surname = surname;
            this.year = year;
        }
    }

    public Human(String name, String surname, short year, byte IQ, String[][] schedule) {
        if(year < 0 || IQ < 0){
            System.out.println("Enter valid year or IQ");
        }
        else{
            this.name = name;
            this.surname = surname;
            this.year = year;
            this.IQ = IQ;
            this.schedule = schedule;
        }
    }

    public Human(String name, String surname, short year, byte IQ,  Family family, String[][] schedule) {
        if(year < 0 || IQ < 0){
            System.out.println("Enter valid year or IQ");
        }
        else{
            this.name = name;
            this.surname = surname;
            this.year = year;
            this.IQ = IQ;
            this.family = family;
            this.schedule = schedule;
        }
    }

    public void greedPet(){
        System.out.println(String.format("Hello %s", family.getPet().getNickname()));
    }

    public void describePet(){
        String sly = "";
        if(family.getPet().getTrickLevel()>50){
            sly = "very sly";
        }else{
            sly = "not sly";
        }
        System.out.println(String.format("I have %s. He is %s years old, he is %s",
                family.getPet().getSpecies(), family.getPet().getAge(), sly));

    }

    public boolean feedPet(boolean isIttime){
        if(isIttime){
            System.out.println(String.format("Hm.. I will feed %s.", family.getPet().getNickname()));
            return true;
        }
        else{
            if(family.getPet().getTrickLevel() >= Math.random()*100){
                System.out.println(String.format("Hm.. I will feed %s.", family.getPet().getNickname()));
                return true;
            }
            else {
                System.out.println(String.format("I think %s is not hungry", family,family.getPet().getNickname()));
                return false;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public byte getIQ() {
        return IQ;
    }

    public void setIQ(byte IQ) {
        this.IQ = IQ;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
    @Override
    public String toString() {

        return String.format("Human{name = %s, surname = %s, year = %s," +
                        " IQ = %s, schedule = %s}", name, surname, year, IQ,
                Arrays.deepToString(getSchedule())
                );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getYear() == human.getYear() && getIQ() == human.getIQ() && Objects.equals(getName(),
                human.getName()) && Objects.equals(getSurname(), human.getSurname()) &&
                Objects.equals(family, human.family) && Arrays.equals(getSchedule(), human.getSchedule());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getSurname(), getYear(), getIQ(), family);
        result = 31 * result + Arrays.hashCode(getSchedule());
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human finalize() called");
        super.finalize();
    }
}
