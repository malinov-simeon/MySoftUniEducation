package p04_InterfacesAndAbstraction.FoodShortage;

import p04_InterfacesAndAbstraction.FoodShortage.BirthdayCelebration.MultipleImplementations.Person.Citizen;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String , Buyer> buyers = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputArray = scanner.nextLine().split("\\s+");

            if (inputArray.length == 4) {
                String citizenName = inputArray[0];
                int citizenAge = Integer.parseInt(inputArray[1]);
                String id = inputArray[2];
                String birthdate = inputArray[3];
                Citizen citizen = new Citizen(citizenName, citizenAge, id, birthdate);
                buyers.put(citizenName, citizen);
            } else if (inputArray.length == 3) {
                String rebelName = inputArray[0];
                int rebelAge = Integer.parseInt(inputArray[1]);
                String group = inputArray[2];
                Rebel rebel = new Rebel(rebelName, rebelAge, group);
                buyers.put(rebelName, rebel);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (buyers.containsKey(command)) {
                buyers.get(command).buyFood();
            }

            command = scanner.nextLine();
        }

        int totalFoodBought = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFoodBought);
    }
}
