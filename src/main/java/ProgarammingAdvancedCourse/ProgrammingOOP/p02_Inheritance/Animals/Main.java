package p02_Inheritance.Animals;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        while (!animal.equals("Beast!")) {
            String[] animalArray = scanner.nextLine().split("\\s+");

            String name = animalArray[0];
            int age = Integer.parseInt(animalArray[1]);
            String gender = animalArray[2];

            Animal currentAnimal = setAnimal(animal, name, age, gender);

            if (currentAnimal != null) {
                System.out.println(currentAnimal);
                System.out.println(currentAnimal.produceSound());
            }

            animal = scanner.nextLine();
        }
    }

    private static Animal setAnimal(String animal, String name, int age, String gender) {
        try {
            switch (animal) {
                case "Cat":
                    return new Cat(name, age, gender);
                case "Dog":
                    return new Dog(name, age, gender);
                case "Frog":
                    return new Frog(name, age, gender);
                case "Tomcat":
                    return new Tomcat(name, age, gender);
                case "Kitten":
                    return new Kitten(name, age, gender);
                default:
                    throw new IllegalStateException("Unexpected value: " + animal);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
