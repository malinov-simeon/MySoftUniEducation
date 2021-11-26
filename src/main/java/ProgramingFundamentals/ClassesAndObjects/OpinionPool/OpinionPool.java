package OpinionPool;

public class OpinionPool {
    int age;
    String name;

    public OpinionPool(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
