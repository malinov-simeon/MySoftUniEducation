package p05_Polymorphism.VehiclesExtension.Vechicle;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm);
        setFuelConsumption(fuelConsumptionPerKm);
    }

    public Truck(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm, tankCapacity);
        setFuelConsumption(fuelConsumptionPerKm);
    }

    private void setFuelConsumption(double fuelConsumptionPerKm) {
        super.fuelConsumption += 1.6;
    }

    @Override
    public void refuel(double fuel) {
        super.refuelValidation(fuel);
        super.fuelQuantity += fuel * 0.95;
    }
}
