package CompanyRoster;

public class Employee {
    String name;
    double salary;
    String position;
    Department department;
    String email;
    int age;

    public Employee(String name, double salary, String position,Department department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }
}
