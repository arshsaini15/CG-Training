public class UC12 {
    public static <U extends IMeasurable> void demonstrateAll(
            Quantity<U> q1,
            Quantity<U> q2,
            U targetUnit) {

        System.out.println("Equality: " + q1.equals(q2));
        System.out.println("Conversion: " + q1.convertTo(targetUnit));
        System.out.println("Addition: " + q1.add(q2, targetUnit));
        System.out.println("Subtraction: " + q1.subtract(q2, targetUnit));
        System.out.println("Division: " + q1.divide(q2));
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {

        // Length
        Quantity<LengthUnit> l1 = new Quantity<>(10, LengthUnit.FEET);
        Quantity<LengthUnit> l2 = new Quantity<>(6, LengthUnit.INCHES);
        demonstrateAll(l1, l2, LengthUnit.FEET);

        // Weight
        Quantity<WeightUnit> w1 = new Quantity<>(10, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> w2 = new Quantity<>(5000, WeightUnit.GRAM);
        demonstrateAll(w1, w2, WeightUnit.KILOGRAM);

        // Volume
        Quantity<VolumeUnit> v1 = new Quantity<>(5, VolumeUnit.LITRE);
        Quantity<VolumeUnit> v2 = new Quantity<>(500, VolumeUnit.MILLILITRE);
        demonstrateAll(v1, v2, VolumeUnit.LITRE);
    }
}
