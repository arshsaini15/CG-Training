package Jan_17_2026.InstancevsClass;

public class OnlineCourse {
    private String courseName;
    private int duration;
    private double fee;

    private static String instituteName = "Institute";

    public OnlineCourse(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }
}
