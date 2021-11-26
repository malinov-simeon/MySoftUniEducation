package p05_Polymorphism.WildFarm.Animals.Main;

import p05_Polymorphism.WildFarm.Animals.Felime.Cat;
import p05_Polymorphism.WildFarm.Animals.Felime.Tiger;
import p05_Polymorphism.WildFarm.Animals.Mammal;
import p05_Polymorphism.WildFarm.Animals.Mouse;
import p05_Polymorphism.WildFarm.Animals.Zebra;
import p05_Polymorphism.WildFarm.Food.Food;
import p05_Polymorphism.WildFarm.Food.Meat;
import p05_Polymorphism.WildFarm.Food.Vegetable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        while (!animal.equals("End")) {
            String[] animalArray = animal.split("\\s+");
            String animalType = animalArray[0];
            String animalName = animalArray[1];
            Double animalWeight = Double.parseDouble(animalArray[2]);
            String livingRegion = animalArray[3];
            Mammal mammal = null;

            String[] foodArr = scanner.nextLine().split("\\s+");
            String foodType = foodArr[0];
            int quantity = Integer.parseInt(foodArr[1]);
            Food food = null;

            if (foodType.equals("Meat")) {
                food = new Meat(quantity);
            } else {
                food = new Vegetable(quantity);
            }

            switch (animalType) {
                case "Mouse":
                    mammal = new Mouse(animalType,animalName , animalWeight, livingRegion);
                    break;
                case "Zebra":
                    mammal = new Zebra(animalType,animalName , animalWeight, livingRegion);
                    break;
                case "Cat":
                    String breed = animalArray[4];
                    mammal = new Cat(animalType,animalName , animalWeight, livingRegion, breed);
                    break;
                case "Tiger":
                    mammal = new Tiger(animalType,animalName , animalWeight, livingRegion);
                    break;
            }

            mammal.makeSound();
            mammal.eat(food);
            System.out.println(mammal);

            animal = scanner.nextLine();
        }
    }
}
