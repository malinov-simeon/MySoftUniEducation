package p04_InterfacesAndAbstraction.BirthdayCelebration.MultipleImplementations.Person;

import p04_InterfacesAndAbstraction.BirthdayCelebration.MultipleImplementations.Birthable;
import p04_InterfacesAndAbstraction.BirthdayCelebration.MultipleImplementations.Identifiable;

public class Citizen implements Person, Birthable, Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Citizen{}";
    }
}
