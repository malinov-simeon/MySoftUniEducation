package CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();
        List<Department> departments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Employee employee;
            String input = scanner.nextLine();
            int inputLength = input.split("\\s+").length;
            String name = input.split("\\s+")[0];
            double salary = Double.parseDouble(input.split("\\s+")[1]);
            String position = input.split("\\s+")[2];
            Department department = new Department(input.split("\\s+")[3]);
            if (inputLength > 3) {
                String email = input.split("\\s+")[4];
                if (inputLength > 4) {
                    int age = Integer.parseInt(input.split("\\s+")[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                } else {
                    employee = new Employee(name, salary, position, department, email, 1);
                }
            } else {
                employee = new Employee(name,salary,position,department,"n/a", 1);
            }
            employees.add(employee);
            departments.add(department);
        }
    }
}
