import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public final class Quantity<U extends IMeasurable> {

    private final BigDecimal value;
    private final U unit;

    public Quantity(BigDecimal value, U unit) {
        if (value == null || unit == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.value = value;
        this.unit = unit;
    }

    public Quantity<U> convertTo(U targetUnit) {
        validateCategory(targetUnit);

        BigDecimal base = unit.toBase(value);
        BigDecimal result = targetUnit.fromBase(base);

        return new Quantity<>(result, targetUnit);
    }

    public Quantity<U> add(Quantity<U> other, U targetUnit) {
        validateCategory(other.unit);
        validateCategory(targetUnit);

        BigDecimal base1 = unit.toBase(this.value);
        BigDecimal base2 = other.unit.toBase(other.value);

        BigDecimal sum = base1.add(base2);
        BigDecimal result = targetUnit.fromBase(sum);

        return new Quantity<>(result, targetUnit);
    }

    private void validateCategory(IMeasurable other) {
        if (!unit.getCategory().equals(other.getCategory())) {
            throw new IllegalArgumentException("Different measurement categories");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Quantity<?> other)) return false;

        if (!unit.getCategory().equals(((IMeasurable) other.unit).getCategory())) {
            return false;
        }

        BigDecimal base1 = unit.toBase(value);
        BigDecimal base2 = ((IMeasurable) other.unit).toBase(other.value);

        return base1.compareTo(base2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit.toBase(value));
    }

    @Override
    public String toString() {
        return value + " " + unit.getUnitName();
    }
}