package UC8;

public class UC8 {
    public static void main(String[] args) {

        QuantityLength a = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength b = new QuantityLength(12.0, LengthUnit.INCHES);

        System.out.println(a.convertTo(LengthUnit.INCHES)); // 12 inches

        System.out.println(a.add(b, LengthUnit.FEET));   // 2 feet
        System.out.println(a.add(b, LengthUnit.YARDS));  // ~0.667 yards

        QuantityLength c = new QuantityLength(36.0, LengthUnit.INCHES);
        QuantityLength d = new QuantityLength(1.0, LengthUnit.YARDS);

        System.out.println(c.equals(d)); // true
    }
}
