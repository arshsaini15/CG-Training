import java.util.Objects;

public final class Quantity<U extends IMeasurable> {

    private static final double EPSILON = 0.0001;

    private final double value;
    private final U unit;

    public Quantity(double value, U unit) {
        if (unit == null) throw new IllegalArgumentException("Unit cannot be null");
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.value = value;
        this.unit = unit;
    }

    public Quantity<U> convertTo(U targetUnit) {
        validateCategory(targetUnit);

        double base = unit.toBase(value);
        double result = targetUnit.fromBase(base);

        return new Quantity<>(result, targetUnit);
    }

    public Quantity<U> add(Quantity<U> other) {
        return add(other, this.unit);
    }

    public Quantity<U> add(Quantity<U> other, U targetUnit) {
        validateCategory(other.unit);
        validateCategory(targetUnit);

        double sum = unit.toBase(value) + other.unit.toBase(other.value);
        double result = targetUnit.fromBase(sum);

        return new Quantity<>(result, targetUnit);
    }

    // 🔥 UC12 SUBTRACTION
    public Quantity<U> subtract(Quantity<U> other) {
        return subtract(other, this.unit);
    }

    public Quantity<U> subtract(Quantity<U> other, U targetUnit) {
        if (other == null) throw new IllegalArgumentException("Other cannot be null");

        validateCategory(other.unit);
        validateCategory(targetUnit);

        double diff = unit.toBase(value) - other.unit.toBase(other.value);
        double result = targetUnit.fromBase(diff);

        return new Quantity<>(result, targetUnit);
    }

    // 🔥 UC12 DIVISION
    public double divide(Quantity<U> other) {
        if (other == null) throw new IllegalArgumentException("Other cannot be null");

        validateCategory(other.unit);

        double base1 = unit.toBase(value);
        double base2 = other.unit.toBase(other.value);

        if (Math.abs(base2) < EPSILON) {
            throw new ArithmeticException("Division by zero");
        }

        return base1 / base2;
    }

    private void validateCategory(IMeasurable otherUnit) {
        if (!unit.getClass().equals(otherUnit.getClass())) {
            throw new IllegalArgumentException("Different measurement categories");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Quantity<?> other)) return false;

        if (!unit.getClass().equals(other.unit.getClass())) return false;

        double base1 = unit.toBase(value);
        double base2 = ((IMeasurable) other.unit).toBase(other.value);

        return Math.abs(base1 - base2) < EPSILON;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Math.round(unit.toBase(value) / EPSILON));
    }

    @Override
    public String toString() {
        return value + " " + unit.getUnitName();
    }
}