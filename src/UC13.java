public class UC13 {
    public static void main(String[] args) {

        Quantity<LengthUnit> q1 = new Quantity<>(1, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12, LengthUnit.INCH);

        System.out.println(q1.add(q2));
        System.out.println(q1.subtract(q2));
        System.out.println(q1.divide(q2));
    }
}
