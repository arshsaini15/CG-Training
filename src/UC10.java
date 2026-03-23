public class UC10 {
    public static void main(String[] args) {

        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);

        System.out.println(q1.equals(q2)); // true

        System.out.println(q1.convertTo(LengthUnit.INCHES)); // 12 INCHES

        System.out.println(q1.add(q2, LengthUnit.FEET)); // 2 FEET


        Quantity<WeightUnit> w1 = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> w2 = new Quantity<>(1000.0, WeightUnit.GRAM);

        System.out.println(w1.equals(w2)); // true

        System.out.println(w1.convertTo(WeightUnit.GRAM)); // 1000 GRAM

        System.out.println(w1.add(w2, WeightUnit.KILOGRAM)); // 2 KG


        // Cross-category check (won't compile if types differ)
        // q1.add(w1); ❌ compile-time error
    }
}
