package UC9;

public enum WeightUnit {

    KILOGRAM(1.0),
    GRAM(0.001),
    POUND(0.453592);

    private final double toKgFactor;

    WeightUnit(double toKgFactor) {
        this.toKgFactor = toKgFactor;
    }

    // Convert to base unit (kg)
    public double convertToBaseUnit(double value) {
        return value * toKgFactor;
    }

    // Convert from base unit (kg)
    public double convertFromBaseUnit(double baseValue) {
        return baseValue / toKgFactor;
    }
}
