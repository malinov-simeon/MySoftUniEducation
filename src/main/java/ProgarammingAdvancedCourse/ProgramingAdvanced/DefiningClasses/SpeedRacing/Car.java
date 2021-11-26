package SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
    }

    public boolean canMove(int amountOfKm) {
        return fuelCostPerKm * amountOfKm <= fuelAmount;
    }

    public String getModel() {
        return this.model;
    }

    public double getFuelCostPerKm() {
        return this.fuelCostPerKm;
    }

    public void setFuelAmount(double fuelCost) {
        this.fuelAmount -= fuelCost;
    }
}
