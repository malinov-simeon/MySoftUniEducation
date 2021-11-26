package p05_Polymorphism.WildFarm.Animals.Felime;

import p05_Polymorphism.WildFarm.Food.Food;

public class Tiger extends Felime {

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            super.foodEaten += food.getQuantity();
        } else {
            System.out.printf("%s are not eating that type of food!%n", this.getClass().getSimpleName());
        }
    }
}
