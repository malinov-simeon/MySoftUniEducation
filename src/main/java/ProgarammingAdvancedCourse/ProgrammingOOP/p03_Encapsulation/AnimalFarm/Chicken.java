package p03_Encapsulation.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.trim().length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chicken " + name + " (age " + age + ") can produce " + calculateProductPerDay() + " eggs per day.";
    }

    private double calculateProductPerDay() {
        if (age < 5) {
            return 2f;
        } else if (age <= 11) {
            return 1f;
        }
        return 0.75;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }
}
