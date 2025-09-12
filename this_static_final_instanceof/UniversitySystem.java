class Student {

    private static String universityTitle;
    private static int totalStudents = 0;

    private final int rollNo;
    private String studentName;
    private char grade;

    public Student(String studentName, int rollNo, char grade) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.grade = grade;
        totalStudents++;
    }

    public static void setUniversityTitle(String title) {
        universityTitle = title;
    }

    public static void showTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void showStudentInfo() {
        if (this instanceof Student) {
            System.out.println("University: " + universityTitle);
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Name: " + studentName);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Object is not an instance of Student class.");
        }
    }

    public void changeGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("Object is not an instance of Student class.");
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public char getGrade() {
        return grade;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student.setUniversityTitle("International University");
        Student student1 = new Student("Hemashree", 101, 'A');
        Student student2 = new Student("Sharmila", 102, 'B');

        Student.showTotalStudents();

        student1.showStudentInfo();
        System.out.println();
        student2.showStudentInfo();

        student2.changeGrade('A');
        System.out.println();
        student2.showStudentInfo();
    }
}
