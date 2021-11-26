package p05_Polymorphism.VehiclesExtension.Vechicle;

import p05_Polymorphism.VehiclesExtension.Bus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carArray = scanner.nextLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(carArray[1]);
        double carLitersPerKm = Double.parseDouble(carArray[2]);
        double carFuelCapacity = Double.parseDouble(carArray[3]);
        Car car = new Car(carFuelQuantity, carLitersPerKm, carFuelCapacity);

        String[] truckArr = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckArr[1]);
        double truckLitersPerKm = Double.parseDouble(truckArr[2]);
        double truckFuelCapacity = Double.parseDouble(carArray[3]);
        Truck truck = new Truck(truckFuelQuantity, truckLitersPerKm, truckFuelCapacity);

        String[] busArr = scanner.nextLine().split("\\s+");
        double busFuelQuantity = Double.parseDouble(busArr[1]);
        double busLitersPerKm = Double.parseDouble(busArr[2]);
        double busFuelCapacity = Double.parseDouble(busArr[3]);
        Bus bus = new Bus(busFuelQuantity, busLitersPerKm, busFuelCapacity);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String commandType = command[0];
            String vehicle = command[1];
            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            switch (vehicle) {
                case "Car":
                    if (commandType.equals("Drive")) {
                        double distance = Double.parseDouble(command[2]);
                        if (car.drive(car.getFuelConsumption(), distance)) {
                            System.out.printf("Car travelled %s km%n", decimalFormat.format(distance));
                        } else {
                            System.out.println("Car needs refueling");
                        }
                    } else if (commandType.equals("Refuel")) {
                        double liters = Double.parseDouble(command[2]);
                        try {
                            car.refuel(liters);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "Truck":
                    if (commandType.equals("Drive")) {
                        double distance = Double.parseDouble(command[2]);
                        if (truck.drive(truck.getFuelConsumption(), distance)) {
                            System.out.printf("Truck travelled %s km%n", decimalFormat.format(distance));
                        } else {
                            System.out.println("Truck needs refueling");
                        }
                    } else if (commandType.equals("Refuel")) {
                        double liters = Double.parseDouble(command[2]);
                        try {
                            truck.refuel(liters);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "Bus":
                    switch (commandType) {
                        case "Drive":
                            double distance = Double.parseDouble(command[2]);
                            if (bus.drive(bus.getDriveWithPeopleConsumption(), distance)) {
                                System.out.printf("Bus travelled %s km%n", decimalFormat.format(distance));
                            } else {
                                System.out.println("Bus needs refueling");
                            }
                            break;
                        case "Refuel":
                            double liters = Double.parseDouble(command[2]);
                            try {
                                bus.refuel(liters);
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case "DriveEmpty":
                            double emptyDistance = Double.parseDouble(command[2]);
                            if (bus.drive(bus.getFuelConsumption(), emptyDistance)) {
                                System.out.printf("Bus travelled %s km%n", decimalFormat.format(emptyDistance));
                            } else {
                                System.out.println("Bus needs refueling");
                            }
                            break;
                    }
                    break;
            }
        }

        System.out.printf("Car: %.2f%n", car.fuelQuantity);
        System.out.printf("Truck: %.2f%n", truck.fuelQuantity);
        System.out.printf("Bus: %.2f", bus.fuelQuantity);
    }

}
