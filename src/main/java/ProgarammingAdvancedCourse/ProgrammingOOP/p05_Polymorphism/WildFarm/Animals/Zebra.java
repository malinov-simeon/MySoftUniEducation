package p05_Polymorphism.WildFarm.Animals;

import p05_Polymorphism.WildFarm.Food.Food;

public class Zebra extends Mammal {


    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            super.foodEaten += food.getQuantity();
        } else {
            System.out.printf("%s are not eating that type of food!%n", this.getClass().getSimpleName());
        }
    }
}
