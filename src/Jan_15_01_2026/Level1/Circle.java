package Jan_15_01_2026.Level1;

class Circle {
    double radius;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7;

        c.calculateArea();
        c.calculateCircumference();
    }
}

