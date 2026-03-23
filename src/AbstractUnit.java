import java.math.BigDecimal;

public abstract class AbstractUnit implements IMeasurable {

    private final String name;
    private final String category;
    private final BigDecimal factor;

    protected AbstractUnit(String name, String category, BigDecimal factor) {
        this.name = name;
        this.category = category;
        this.factor = factor;
    }

    @Override
    public BigDecimal toBase(BigDecimal value) {
        return value.multiply(factor);
    }

    @Override
    public BigDecimal fromBase(BigDecimal baseValue) {
        return baseValue.divide(factor);
    }

    @Override
    public String getUnitName() {
        return name;
    }

    @Override
    public String getCategory() {
        return category;
    }
}