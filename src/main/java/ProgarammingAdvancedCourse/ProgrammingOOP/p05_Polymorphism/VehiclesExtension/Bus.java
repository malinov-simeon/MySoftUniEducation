package p05_Polymorphism.VehiclesExtension;

import p05_Polymorphism.VehiclesExtension.Vechicle.Vehicle;

public class Bus extends Vehicle {
    private double driveWithPeopleConsumption;

    public Bus(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm);
        setDriveWithPeopleConsumption(fuelConsumptionPerKm);
    }

    public Bus(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm, tankCapacity);
        setDriveWithPeopleConsumption(fuelConsumptionPerKm);
    }

    private void setDriveWithPeopleConsumption(double fuelConsumptionPerKm) {
        this.driveWithPeopleConsumption = fuelConsumptionPerKm + 1.4;
    }

    @Override
    public void refuel(double fuel) {
        super.refuelValidation(fuel);
        super.fuelQuantity += fuel;
    }

    public double getDriveWithPeopleConsumption() {
        return driveWithPeopleConsumption;
    }
}
