package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Vehicle> catalogue = new ArrayList<>();

        while (!command.equals("End")) {
            String[] commandArray = command.split("\\s+");
            String type = commandArray[0];
            String model = commandArray[1];
            String color = commandArray[2];
            int hp = Integer.parseInt(commandArray[3]);
            Vehicle newVehicle = new Vehicle(type, model, color, hp);
            catalogue.add(newVehicle);
            command = scanner.nextLine();
        }

        int carsHorsepower = 0;
        int carsCounter = 0;
        int trucksHorsepower = 0;
        int truckCounter = 0;
        double averageCarsHorsepower = 0;
        double averageTrucksHorsepower = 0;

        for (Vehicle vehicle : catalogue) {
            if (vehicle.getType().equals("Car")) {
                carsHorsepower += vehicle.getHp();
                carsCounter++;
            } else if (vehicle.getType().equals("Truck")) {
                trucksHorsepower += vehicle.getHp();
                truckCounter++;
            }
        }

        if (carsCounter > 0) {
            averageCarsHorsepower = 1.0 * carsHorsepower / carsCounter;
        }
        if (truckCounter > 0) {
            averageTrucksHorsepower = 1.0 * trucksHorsepower / truckCounter;
        }

        command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")) {
            for (Vehicle vehicle : catalogue) {
                if (vehicle.getModel().equals(command)) {
                    System.out.println(vehicle);
                }
            }
            command = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHorsepower);

        System.out.printf("Trucks have average horsepower of: %.2f.", averageTrucksHorsepower);
    }
}
