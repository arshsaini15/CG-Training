package UC4;

public class UC4 {
    public static void main(String[] args) {

        // Feet ↔ Inches
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);

        System.out.println("1 ft == 12 inch: " + q1.equals(q2)); // true

        // Yards ↔ Feet
        Quantity q3 = new Quantity(1.0, LengthUnit.YARD);
        Quantity q4 = new Quantity(3.0, LengthUnit.FEET);

        System.out.println("1 yard == 3 ft: " + q3.equals(q4)); // true

        // Yards ↔ Inches
        Quantity q5 = new Quantity(1.0, LengthUnit.YARD);
        Quantity q6 = new Quantity(36.0, LengthUnit.INCH);

        System.out.println("1 yard == 36 inch: " + q5.equals(q6)); // true

        // Centimeters ↔ Inches
        Quantity q7 = new Quantity(1.0, LengthUnit.CENTIMETER);
        Quantity q8 = new Quantity(0.393701, LengthUnit.INCH);

        System.out.println("1 cm == 0.393701 inch: " + q7.equals(q8)); // true

        // Same unit equality
        Quantity q9 = new Quantity(2.0, LengthUnit.YARD);
        Quantity q10 = new Quantity(2.0, LengthUnit.YARD);

        System.out.println("2 yard == 2 yard: " + q9.equals(q10)); // true

        // Different values
        Quantity q11 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q12 = new Quantity(2.0, LengthUnit.FEET);

        System.out.println("1 ft == 2 ft: " + q11.equals(q12)); // false
    }
}
