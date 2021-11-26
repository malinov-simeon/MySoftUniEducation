package OrderByAge;

public class Person {
    String name;
    String ID;
    int age;

    public Person(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return String.format("%s with ID: %s is %d years old.", name, ID, age);
    }
}
