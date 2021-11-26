package VehicleCatalogue;

public class Vehicle {
    String type;
    String model;
    String color;
    int hp;

    public Vehicle(String type, String model, String color, int hp) {
        if (type.equals("car")) {
            this.type = "Car";
        } else {
            this.type = "Truck";
        }
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    public String toString() {
        return String.format("Type: %s%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d", type, model, color, hp);
    }

    public String getModel() {
        return this.model;
    }

    public int getHp() {
        return this.hp;
    }

    public String getType() {
        return this.type;
    }

}
