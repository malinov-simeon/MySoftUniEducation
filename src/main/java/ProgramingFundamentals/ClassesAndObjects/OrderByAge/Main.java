package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String command = scanner.nextLine();


        while (!command.equals("End")) {
            String[] commandSplit = command.split("\\s+");
            String name = commandSplit[0];
            String ID = commandSplit[1];
            int age = Integer.parseInt(commandSplit[2]);
            Person person = new Person(name, ID, age);
            people.add(person);
            command = scanner.nextLine();
        }

        people.sort(Comparator.comparing(Person::getAge));
        people.forEach(System.out::println);
    }
}
