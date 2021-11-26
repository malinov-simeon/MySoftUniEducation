package SpeedRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carArray = scanner.nextLine().split("\\s+");
            String model = carArray[0];
            double fuelAmount = Integer.parseInt(carArray[1]);
            double fuelPer1Km = Double.parseDouble(carArray[2]);
            Car car = new Car(model, fuelAmount, fuelPer1Km);
            cars.add(car);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String [] commandArray = command.split("\\s+");
            String carModel = commandArray[1];
            int distanceTraveled = Integer.parseInt(commandArray[2]);
            Car car = null;
            for (Car car1 : cars) {
                if (car1.getModel().equals(carModel)) {
                    car = car1;
                    break;
                }
            }
            if (car.canMove(distanceTraveled)) {
                double fuelCost = distanceTraveled * car.getFuelCostPerKm();
                car.setFuelAmount(fuelCost);
            } else {
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine();
        }
    }
}
