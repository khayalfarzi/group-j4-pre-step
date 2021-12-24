package az.iktlab.groupJ4.JavaLessons.HappyFamily;

import java.util.Arrays;
import java.util.Objects;

enum Species {
    Cat(false, (byte) 4, true),
    Dog(false, (byte) 4, true),
    Parrot(true, (byte) 2, false);

    private boolean canFly;
    private byte numberOfLegs;
    private boolean hasFur;

    Species(boolean canFly, byte numberOfLegs, boolean hasFur){
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public byte getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(byte numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return "Species{" +
                "canFly=" + canFly +
                ", numberOfLegs=" + numberOfLegs +
                ", hasFur=" + hasFur +
                '}';
    }
}

public class Pet {
    private Species species;
    private String nickname;
    private byte age;
    private byte trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, byte age, byte trickLevel, String[] habits) {
        if(age < 0 || trickLevel < 0){
            System.out.println("Enter valid age or tricklevel");
        }
        else{
            this.species = species;
            this.nickname = nickname;
            this.age = age;
            this.trickLevel = trickLevel;
            this.habits = habits;
        }
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(){
        System.out.println(String.format("Hello owner. I am %s. I miss you", nickname));
    }

    public void foul(){
        System.out.println("I need cover it up");
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age <= 0){
            System.out.println("Enter valid age");
        }else
        this.age = age;
    }

    public byte getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(byte trickLevel) {
        if(trickLevel < 0){
            System.out.println("Enter valid tricklevel");
        }else
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return String.format("%s{nickname = %s, age = %s, trickLevel = %s, habits = %s}",
                species, nickname, age, trickLevel, Arrays.toString(habits));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getAge() == pet.getAge() && getTrickLevel() == pet.getTrickLevel()
                && Objects.equals(getSpecies(), pet.getSpecies()) &&
                Objects.equals(getNickname(), pet.getNickname()) &&
                Arrays.equals(getHabits(), pet.getHabits());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel());
        result = 31 * result + Arrays.hashCode(getHabits());
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pet finalize() called");
        super.finalize();
    }
}
