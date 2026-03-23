import java.math.BigDecimal;

public interface IMeasurable {
    BigDecimal toBase(BigDecimal value);
    BigDecimal fromBase(BigDecimal baseValue);
    String getUnitName();
    String getCategory(); // NEW: length, weight, volume
}