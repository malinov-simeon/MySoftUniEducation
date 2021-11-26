package p05_Polymorphism.WildFarm.Animals;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    protected String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }




    @Override
    public String toString() {
        //"{AnimalType} [{AnimalName}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]"
        return String.format("%s[%s, %s, %s, %d]", super.animalType, super.animalName, weightFormater(), livingRegion, super.foodEaten);
    }

    protected String weightFormater() {
        DecimalFormat decimalFormat = new DecimalFormat("###.#");
        return decimalFormat.format(super.animalWeight);
    }
}
