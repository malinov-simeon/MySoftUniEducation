package StudentsLab;

public class Student {
    String firstName;
    String LastName;
    int age;
    String hometown;

    public Student(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }
}
