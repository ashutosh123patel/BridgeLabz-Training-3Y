

import java.util.ArrayList;

class Employee {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void getDetails() {
        System.out.println(name + " (ID: " + employeeId + ")");
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void showEmployees() {
        System.out.println("Employees in " + name + " Department:");
        for (Employee e : employees) {
            e.getDetails();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department department) {
        departments.add(department);
    }

    void showDepartments() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            System.out.println("Department: " + d.name);
            d.showEmployees();
        }
    }
}

public class CompanyApplication {
    public static void main(String[] args) {
        Company company1 = new Company("TechCorp");

        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);

        itDept.addEmployee(emp1);
        itDept.addEmployee(emp2);
        hrDept.addEmployee(emp3);

        company1.addDepartment(itDept);
        company1.addDepartment(hrDept);

        company1.showDepartments();
    }
}

