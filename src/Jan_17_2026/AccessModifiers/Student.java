package Jan_17_2026.AccessModifiers;

public class Student {
    public int rollNumber;
    protected String name = "John";
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public Student() {}

    public void setCGPA (double CGPA) {
        this.CGPA = CGPA;
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Abc", 7.99);
        student.setCGPA(8.24);
    }
}

class PostgraduateStudent extends Student {
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent();
        System.out.println(student.name);
    }
}
