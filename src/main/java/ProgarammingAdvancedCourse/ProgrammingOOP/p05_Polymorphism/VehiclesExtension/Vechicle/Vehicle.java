package p05_Polymorphism.VehiclesExtension.Vechicle;

public abstract class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumptionPerKm;
    }

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        this(fuelQuantity, fuelConsumptionPerKm);
        this.tankCapacity = tankCapacity;
    }

    public boolean drive(double fuelConsumptionPerKm, double distance) {
        if (fuelQuantity >= fuelConsumptionPerKm * distance) {
            fuelQuantity -= fuelConsumptionPerKm * distance;
            return true;
        }
        return false;
    }

    public abstract void refuel(double fuel);

    protected void refuelValidation(double fuel) {
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else if (fuel + fuelQuantity > tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
