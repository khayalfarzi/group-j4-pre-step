package az.iktlab.happyMiniProject.step1;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private short dateOfBirth;
    private byte iq;
    private String[][] schedule;
    private Family family;





    public Human() {
    }

    public Human(String name, String surname, short dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, short dateOfBirth, byte iq, String[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
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

    public short getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(short dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public byte getIq() {
        return iq;
    }

    public void setIq(byte iq) {
        if (iq>=1 && iq<=100)
        this.iq = iq;
        else iq=0;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                ", family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return dateOfBirth == human.dateOfBirth && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Arrays.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, dateOfBirth, iq, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}
