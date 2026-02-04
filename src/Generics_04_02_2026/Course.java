package Generics_04_02_2026;

import java.util.*;

// Abstract evaluation type
abstract class CourseType {
    private String evaluationMethod;

    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    public abstract void evaluate();
}

class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }

    public void evaluate() {
        System.out.println("Evaluating via exams.");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }

    public void evaluate() {
        System.out.println("Evaluating via assignments.");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based");
    }

    public void evaluate() {
        System.out.println("Evaluating via research work.");
    }
}

// Generic course manager
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    // Wildcard handler
    public static void processCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.evaluate();
        }
    }
}
