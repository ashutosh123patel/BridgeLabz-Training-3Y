import java.util.*;

class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Subject sub) {
        subjects.add(sub);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

class Calculator {
    public String grade(Student s) {
        int total = 0;
        for (Subject sub : s.getSubjects()) {
            total += sub.getMarks();
        }
        double avg = total / (double) s.getSubjects().size();

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 40) return "D";
        else return "F";
    }
}

public class SchoolGrade {
    public static void main(String[] args) {
        Student raghav = new Student("Raghav");
        raghav.add(new Subject("Maths", 90));
        raghav.add(new Subject("Science", 85));

        Calculator calc = new Calculator();
        String grade = calc.grade(raghav);

        System.out.println("Student: " + raghav.getName());
        for (Subject sub : raghav.getSubjects()) {
            System.out.println(sub.getName() + ": " + sub.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}
