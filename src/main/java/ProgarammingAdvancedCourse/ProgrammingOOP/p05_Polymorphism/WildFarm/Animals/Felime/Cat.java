package p05_Polymorphism.WildFarm.Animals.Felime;

import p05_Polymorphism.WildFarm.Food.Food;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.foodEaten += food.getQuantity();
    }

    public String toString() {
        //                  "{AnimalType} [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]"
        return String.format("%s[%s, %s, %s, %s, %d]", super.animalType, super.animalName, breed, super.weightFormater(), super.livingRegion, super.foodEaten);
    }

}
