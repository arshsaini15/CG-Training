package Jan_22_01_2026.SelfProblems;

import java.util.ArrayList;
import java.util.List;

public class SchoolAndStudent {

    public static void main(String[] args) {

        School school = new School("ABC Public School");

        Student s1 = new Student("ABC");
        Student s2 = new Student("XYZ");

        Course math = new Course("Mathematics");
        Course cs = new Course("Computer Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(math);
        s1.enroll(cs);
        s2.enroll(cs);

        s1.viewCourses();
        s2.viewCourses();

        math.viewStudents();
        cs.viewStudents();
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void viewCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println(" - " + c.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void viewStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }

    public String getName() {
        return name;
    }
}
