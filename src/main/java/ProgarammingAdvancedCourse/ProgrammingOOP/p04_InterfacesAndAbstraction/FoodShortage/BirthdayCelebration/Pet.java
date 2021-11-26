package p04_InterfacesAndAbstraction.FoodShortage.BirthdayCelebration;

import p04_InterfacesAndAbstraction.FoodShortage.BirthdayCelebration.MultipleImplementations.Birthable;

public class Pet implements Birthable {
    private String birthdate;
    private String name;

    public Pet(String name, String birthdate) {
        this.birthdate = birthdate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return birthdate;
    }
}
