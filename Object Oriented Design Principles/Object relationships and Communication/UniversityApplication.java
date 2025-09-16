import java.util.ArrayList;

class Faculty {
    String name;
    int facultyId;

    Faculty(String name, int facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    void getDetails() {
        System.out.println(name + " (ID: " + facultyId + ")");
    }
}

class Department {
    String name;
    ArrayList<Faculty> facultyList = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    void showFaculty() {
        System.out.println("Faculty in " + name + " Department:");
        for (Faculty f : facultyList) {
            f.getDetails();
        }
    }
}

class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showDepartments() {
        System.out.println("University: " + name);
        for (Department d : departments) {
            System.out.println("Department: " + d.name);
            d.showFaculty();
        }
    }
}

public class UniversityApplication {
    public static void main(String[] args) {
        University uni1 = new University("Tech University");

        Department csDept = new Department("Computer Science");
        Department mechDept = new Department("Mechanical");

        Faculty faculty1 = new Faculty("Dr. Smith", 101);
        Faculty faculty2 = new Faculty("Dr. Alice", 102);
        Faculty faculty3 = new Faculty("Dr. Bob", 103);

        csDept.addFaculty(faculty1);
        mechDept.addFaculty(faculty2);

        uni1.addDepartment(csDept);
        uni1.addDepartment(mechDept);

        uni1.showDepartments();

        System.out.println("\nIndependent Faculty:");
        faculty3.getDetails();
    }
}
