package UC5;

public class UC5 {
    private enum LengthUnit {
        FEET(1.0),
        INCHES(1.0 / 12),
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

        public QuantityLength(double value, LengthUnit unit) {
            if (!Double.isFinite(value) || unit == null) {
                throw new IllegalArgumentException();
            }
            this.value = value;
            this.unit = unit;
        }

        public QuantityLength convertTo(LengthUnit target) {
            double newValue = convert(this.value, this.unit, target);
            return new QuantityLength(newValue, target);
        }

        private double toBase() {
            return value * unit.getFactor();
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof QuantityLength other)) return false;
            return Math.abs(this.toBase() - other.toBase()) < 1e-6;
        }
    }

    static void main(String[] args) {

        // Basic conversions
        System.out.println(convert(1.0, LengthUnit.FEET, LengthUnit.INCHES));   // 12.0
        System.out.println(convert(3.0, LengthUnit.YARDS, LengthUnit.FEET));    // 9.0
        System.out.println(convert(36.0, LengthUnit.INCHES, LengthUnit.YARDS)); // 1.0

        // Object-based conversion
        QuantityLength length = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength converted = length.convertTo(LengthUnit.INCHES);
        System.out.println(converted);

        // Equality check (this is where most people fail)
        QuantityLength l1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength l2 = new QuantityLength(12.0, LengthUnit.INCHES);

        System.out.println(l1.equals(l2)); // should be true

        // Edge cases
        System.out.println(convert(0.0, LengthUnit.FEET, LengthUnit.INCHES)); // 0.0
        System.out.println(convert(-1.0, LengthUnit.FEET, LengthUnit.INCHES)); // -12.0

        // Round-trip test (important)
        double original = 5.0;
        double convertedValue = convert(original, LengthUnit.FEET, LengthUnit.INCHES);
        double back = convert(convertedValue, LengthUnit.INCHES, LengthUnit.FEET);

        System.out.println(Math.abs(original - back) < 1e-6); // should be true
    }

    public static double convert(double value, LengthUnit source, LengthUnit target) {
        if (!Double.isFinite(value) || source == null || target == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        return value * (source.getFactor() / target.getFactor());
    }
}
