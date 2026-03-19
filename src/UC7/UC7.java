package UC7;

public class UC7 {
    public static void main(String[] args) {

        QuantityLength a = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength b = new QuantityLength(12.0, LengthUnit.INCHES);

        System.out.println(a.add(b, LengthUnit.FEET));     // 2.0 FEET
        System.out.println(a.add(b, LengthUnit.INCHES));   // 24.0 INCHES
        System.out.println(a.add(b, LengthUnit.YARDS));    // ~0.667 YARDS

        QuantityLength c = new QuantityLength(2.54, LengthUnit.CENTIMETERS);
        QuantityLength d = new QuantityLength(1.0, LengthUnit.INCHES);

        System.out.println(c.add(d, LengthUnit.CENTIMETERS)); // ~5.08 CM
    }
}
