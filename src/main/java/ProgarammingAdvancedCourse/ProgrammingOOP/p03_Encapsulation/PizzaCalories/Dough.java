package p03_Encapsulation.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setWeight(weight);
        setBakingTechnique(bakingTechnique);
    }

    private void setWeight(double weight) {
        if (weight > 200 || weight < 1) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        if (flourType.trim().isEmpty() ||
                !flourType.equals("White") &&
                !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.trim().isEmpty() ||
                !bakingTechnique.equals("Crispy") &&
                !bakingTechnique.equals("Chewy") &&
                !bakingTechnique.equals("Homemade")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories() {
        double calories = weight * 2;
        if (flourType.equals("White")) {
            calories *= 1.5;
        } else if (flourType.equals("Wholegrain")) {
            calories *= 1;
        }
        if (bakingTechnique.equals("Crispy")) {
            calories *= 0.9;
        } else if (bakingTechnique.equals("Chewy")) {
            calories *= 1.1;
        } else if (bakingTechnique.equals("Homemade")) {
            calories *= 1;
        }
        return calories;
    }
}
