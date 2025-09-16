import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> enrolledStudents = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class SchoolApplication {
    public static void main(String[] args) {
        School school1 = new School("Savitri Public School");

        Student john = new Student("ashutosh");
        Student priya = new Student("Priya");

        school1.addStudent(john);
        school1.addStudent(priya);

        Course maths = new Course("Maths");
        Course science = new Course("Science");

        john.enrollInCourse(maths);
        john.enrollInCourse(science);
        priya.enrollInCourse(science);

        school1.showStudents();
        john.viewCourses();
        priya.viewCourses();

        maths.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}

