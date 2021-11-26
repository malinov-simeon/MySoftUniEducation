package p05_Polymorphism.VehiclesExtension.Vechicle;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm);
        additionalConsumption();
    }

    public Car(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm, tankCapacity);
        additionalConsumption();
    }

    private void additionalConsumption() {
        super.fuelConsumption += 0.9;
    }

    @Override
    public void refuel(double fuel) {
        super.refuelValidation(fuel);
        super.fuelQuantity += fuel;
    }
}
