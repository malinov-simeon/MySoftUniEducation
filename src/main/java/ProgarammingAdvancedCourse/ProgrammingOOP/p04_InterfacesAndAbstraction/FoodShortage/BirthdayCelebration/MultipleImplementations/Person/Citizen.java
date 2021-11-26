package p04_InterfacesAndAbstraction.FoodShortage.BirthdayCelebration.MultipleImplementations.Person;

import p04_InterfacesAndAbstraction.FoodShortage.BirthdayCelebration.MultipleImplementations.Birthable;
import p04_InterfacesAndAbstraction.FoodShortage.BirthdayCelebration.MultipleImplementations.Identifiable;
import p04_InterfacesAndAbstraction.FoodShortage.Buyer;

public class Citizen implements Person, Birthable, Identifiable, Buyer {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food = 0;

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

    @Override
    public void buyFood() {
        food += 10;
    }

    @Override
    public int getFood() {
        return food;
    }
}
