package p05_Polymorphism.WildFarm.Animals;

import p05_Polymorphism.WildFarm.Food.Food;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    public Animal( String animalType, String animalName, Double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public abstract void makeSound();
    public abstract void eat(Food food);
}
