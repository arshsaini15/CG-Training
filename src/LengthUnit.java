public enum LengthUnit implements IMeasurable<LengthUnit> {
    INCH(1.0),
    FEET(12.0);

    private final double toInchFactor;

    LengthUnit(double toInchFactor) {
        this.toInchFactor = toInchFactor;
    }

    @Override
    public double toBase(double value) {
        return value * toInchFactor;
    }

    @Override
    public double fromBase(double baseValue) {
        return baseValue / toInchFactor;
    }
}