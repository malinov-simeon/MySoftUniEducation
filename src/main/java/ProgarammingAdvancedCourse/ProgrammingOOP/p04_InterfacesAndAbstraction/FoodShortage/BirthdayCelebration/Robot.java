package p04_InterfacesAndAbstraction.FoodShortage.BirthdayCelebration;

import p04_InterfacesAndAbstraction.FoodShortage.BirthdayCelebration.MultipleImplementations.Identifiable;

public class Robot implements Identifiable {
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
