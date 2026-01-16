package Jan_17_2026.Level1;

public class Circle {

    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.radius);

        Circle circle2 = new Circle();
        System.out.println(circle2.radius);
    }
}
