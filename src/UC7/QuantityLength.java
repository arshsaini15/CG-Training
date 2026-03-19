package UC7;

public final class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid numeric value");
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

    // 🔥 UC7 METHOD (core logic)
    public QuantityLength add(QuantityLength other, LengthUnit targetUnit) {
        if (other == null || targetUnit == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }

        // Convert both to base (feet)
        double thisInFeet = this.unit.toBase(this.value);
        double otherInFeet = other.unit.toBase(other.value);

        // Add in base unit
        double sumInFeet = thisInFeet + otherInFeet;

        // Convert to target unit
        double result = targetUnit.fromBase(sumInFeet);

        return new QuantityLength(result, targetUnit);
    }

    @Override
    public String toString() {
        return String.format("Quantity(%.3f, %s)", value, unit);
    }
}