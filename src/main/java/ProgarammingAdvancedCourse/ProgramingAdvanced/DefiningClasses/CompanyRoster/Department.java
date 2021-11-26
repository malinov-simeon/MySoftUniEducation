package CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final List<Employee> employees;

    public Department() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return  this.employees;
    }

    public double getAverageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
    }
}
