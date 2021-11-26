package StudentsLab_02;

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

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
