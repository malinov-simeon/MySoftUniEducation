package p04_InterfacesAndAbstraction.BirthdayCelebration;

import p04_InterfacesAndAbstraction.BirthdayCelebration.MultipleImplementations.Birthable;
import p04_InterfacesAndAbstraction.BirthdayCelebration.MultipleImplementations.Person.Citizen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Birthable> content = new ArrayList<>();

        while (!command.equals("End")) {

            String[] commandArray = command.split("\\s+");
            String select = commandArray[0];

            switch (select) {
                case "Citizen":
                    String citizenName = commandArray[1];
                    int age = Integer.parseInt(commandArray[2]);
                    String citizenId = commandArray[3];
                    String citizenBirthdate = commandArray[4];
                    Citizen citizen = new Citizen(citizenName, age, citizenId, citizenBirthdate);
                    content.add(citizen);
                    break;
                case "Pet":
                    String petName = commandArray[1];
                    String petBirthdate = commandArray[2];
                    Pet pet = new Pet(petName, petBirthdate);
                    content.add(pet);
                    break;
                case "Robot":
                    String model = commandArray[1];
                    String robotId = commandArray[2];
                    Robot robot = new Robot(robotId, model);
                    break;
            }

            command = scanner.nextLine();
        }

        String year = scanner.nextLine();

        List<String> dates = content.stream()
                .map(Birthable::getBirthDate)
                .filter(b -> b.endsWith(year))
                .collect(Collectors.toList());

        if (dates.isEmpty()) {
            System.out.println("<no output>");
        } else {
            dates.forEach(System.out::println);
        }
    }
}
