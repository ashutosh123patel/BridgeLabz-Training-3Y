

class Employee {

    private static String organizationName;
    private static int totalEmployees = 0;

    private String employeeName;
    private final int employeeId;
    private String role;

    public Employee(String employeeName, int employeeId, String role) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.role = role;
        totalEmployees++;
    }

    public static void setOrganizationName(String name) {
        organizationName = name;
    }

    public static void showTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void showEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Organization: " + organizationName);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + employeeName);
            System.out.println("Role: " + role);
        } else {
            System.out.println("Not an instance of Employee class.");
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getRole() {
        return role;
    }
}

public class CompanySystem {
    public static void main(String[] args) {
        Employee.setOrganizationName("Innovative Tech Ltd.");
        Employee emp1 = new Employee("Amit Sharma", 201, "Software Developer");
        Employee emp2 = new Employee("Sneha Kapoor", 202, "Team Lead");

        Employee.showTotalEmployees();

        emp1.showEmployeeDetails();
        emp2.showEmployeeDetails();
    }
}

