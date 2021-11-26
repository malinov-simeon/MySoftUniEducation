package CompanyRoster;

import java.util.*;

public class Main {
    static double maxAverage = Double.MIN_VALUE;
    static String maxAverageDepartment;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departments = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];
            int age = -1;
            String email = "n/a";
            if (data.length == 6) {
                email = data[4];
                age = Integer.parseInt(data[5]);
            } else if (data.length == 5) {
                try {
                    age = Integer.parseInt(data[4]);
                } catch (NumberFormatException e) {
                    email = data[4];
                }
            }
            Employee employee = new Employee(name, salary, position, department, email, age);
            departments.putIfAbsent(department, new Department());
            departments.get(department).getEmployees().add(employee);
        }

        for (Map.Entry<String, Department> stringDepartmentEntry : departments.entrySet()) {
            double currentAverage = stringDepartmentEntry.getValue().getAverageSalary();
            String currentDepartment = stringDepartmentEntry.getKey();
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
                maxAverageDepartment = currentDepartment;
            }
        }

        System.out.println("Highest Average Salary: " + maxAverageDepartment);
        departments.get(maxAverageDepartment).getEmployees()
                .stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);
    }
}
