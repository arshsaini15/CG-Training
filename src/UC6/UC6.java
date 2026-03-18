package UC6;

public class UC6 {

    enum LengthUnit {

        FEET(1.0),
        INCHES(1.0 / 12.0),
        YARDS(3.0),
        CENTIMETERS(0.0328084);

        private final double factor;

        LengthUnit(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }

    static class QuantityLength {

        private final double value;
        private final LengthUnit unit;
        private static final double EPSILON = 1e-6;

        public QuantityLength(double value, LengthUnit unit) {
            if (!Double.isFinite(value) || unit == null) {
                throw new IllegalArgumentException("Invalid input");
            }
            this.value = value;
            this.unit = unit;
        }

        public double getValue() {
            return value;
        }

        public LengthUnit getUnit() {
            return unit;
        }

        public QuantityLength convertTo(LengthUnit target) {
            if (target == null) {
                throw new IllegalArgumentException("Target unit cannot be null");
            }

            double baseValue = toBase();
            double converted = baseValue / target.getFactor();

            return new QuantityLength(converted, target);
        }

        public QuantityLength add(QuantityLength other) {
            if (other == null) {
                throw new IllegalArgumentException("Other cannot be null");
            }

            double sumBase = this.toBase() + other.toBase();
            double resultValue = sumBase / this.unit.getFactor();

            return new QuantityLength(resultValue, this.unit);
        }

        private double toBase() {
            return this.value * this.unit.getFactor();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof QuantityLength other)) return false;

            return Math.abs(this.toBase() - other.toBase()) < EPSILON;
        }

        @Override
        public String toString() {
            return String.format("%.6f %s", value, unit);
        }
    }


    public static void main(String[] args) {

        QuantityLength a = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength b = new QuantityLength(12.0, LengthUnit.INCHES);

        QuantityLength result1 = a.add(b);
        System.out.println("1 FEET + 12 INCHES = " + result1); // ~2 FEET

        QuantityLength result2 = b.add(a);
        System.out.println("12 INCHES + 1 FEET = " + result2); // ~24 INCHES

        System.out.println("Physically equal? " + result1.equals(result2));

        QuantityLength c = new QuantityLength(2.0, LengthUnit.FEET);
        QuantityLength result3 = a.add(c);
        System.out.println("1 FEET + 2 FEET = " + result3); // 3 FEET

        QuantityLength d = new QuantityLength(1.0, LengthUnit.YARDS);
        QuantityLength e = new QuantityLength(3.0, LengthUnit.FEET);

        System.out.println("1 YARD + 3 FEET = " + d.add(e)); // 2 YARDS

        QuantityLength f = new QuantityLength(2.54, LengthUnit.CENTIMETERS);
        QuantityLength g = new QuantityLength(1.0, LengthUnit.INCHES);

        System.out.println("2.54 CM + 1 INCH = " + f.add(g)); // ~5.08 CM

        QuantityLength zero = new QuantityLength(0.0, LengthUnit.INCHES);
        System.out.println("5 FEET + 0 INCHES = " +
                new QuantityLength(5.0, LengthUnit.FEET).add(zero));

        QuantityLength neg = new QuantityLength(-2.0, LengthUnit.FEET);
        System.out.println("5 FEET + (-2 FEET) = " +
                new QuantityLength(5.0, LengthUnit.FEET).add(neg));

        QuantityLength original = new QuantityLength(5.0, LengthUnit.FEET);
        QuantityLength converted = original.convertTo(LengthUnit.INCHES);
        QuantityLength back = converted.convertTo(LengthUnit.FEET);

        System.out.println("Round-trip equal? " + original.equals(back));
    }
}