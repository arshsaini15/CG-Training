public class Length {

    private double value;
    private LengthUnit unit;

    public enum LengthUnit {

        Feet(12.0),
        Inches(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    private double convertToBaseUnit(double value) {
        return value * unit.getConversionFactor();
    }

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length thatLength) {
        return Double.compare(this.value, thatLength.value) == 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Length)) return false;

        Length that = (Length) obj;

        return Double.compare(this.convertToBaseUnit(this.value), that.convertToBaseUnit(((Length) obj).value)) == 0;
    }
}