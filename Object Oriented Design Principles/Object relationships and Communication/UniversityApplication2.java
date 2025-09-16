import java.util.ArrayList;

class Student {
    String name;
    int studentId;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class Professor {
    String name;
    int professorId;
    ArrayList<Course> courses = new ArrayList<>();

    Professor(String name, int professorId) {
        this.name = name;
        this.professorId = professorId;
    }

    void assignCourse(Course course) {
        courses.add(course);
        course.setProfessor(this);
    }

    void showCourses() {
        System.out.println(name + " teaches:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void setProfessor(Professor professor) {
        this.professor = professor;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
        if(professor != null) {
            System.out.println("Professor: " + professor.name);
        }
    }
}

public class UniversityApplication2 {
    public static void main(String[] args) {
        Student student1 = new Student("John", 101);
        Student student2 = new Student("Priya", 102);

        Professor prof1 = new Professor("Dr. Smith", 201);
        Professor prof2 = new Professor("Dr. Alice", 202);

        Course course1 = new Course("Maths");
        Course course2 = new Course("Physics");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);

        prof1.assignCourse(course1);
        prof2.assignCourse(course2);

        student1.showCourses();
        student2.showCourses();

        course1.showStudents();
        course2.showStudents();

        prof1.showCourses();
        prof2.showCourses();
    }
}
