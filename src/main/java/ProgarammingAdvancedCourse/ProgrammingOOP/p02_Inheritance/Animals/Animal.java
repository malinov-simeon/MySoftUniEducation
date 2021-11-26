package p02_Inheritance.Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    private void setName(String name) {
        validation(name);
        this.name = name;
    }

    private void setAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        validation(age + "");
        this.age = age;
    }


    private void setGender(String gender) {
        validation(gender);
        this.gender = gender;
    }

    private void validation(String input) {
        if (input.trim().isEmpty() && (gender.equals("Male") || gender.equals("Female"))) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append(String.format("%s%n", this.getClass().getSimpleName()));

        str.append(String.format("%s %d %s%n"
                , this.getName(), this.getAge(), this.getGender()));

        str.append(this.produceSound());

        return str.toString();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound() {
        return "";
    }
}
