import java.math.BigDecimal;

public class UC11 {
    public static void main(String[] args) {

        // Register units dynamically
        UnitRegistry.register("METER", "LENGTH", 1.0);
        UnitRegistry.register("CENTIMETER", "LENGTH", 0.01);

        UnitRegistry.register("KILOGRAM", "WEIGHT", 1.0);
        UnitRegistry.register("GRAM", "WEIGHT", 0.001);

        UnitRegistry.register("LITRE", "VOLUME", 1.0);
        UnitRegistry.register("MILLILITRE", "VOLUME", 0.001);
        UnitRegistry.register("GALLON", "VOLUME", 3.78541);

        // Use dynamically
        Quantity<Unit> q1 = new Quantity<>(BigDecimal.valueOf(1), UnitRegistry.get("LITRE"));
        Quantity<Unit> q2 = new Quantity<>(BigDecimal.valueOf(1000), UnitRegistry.get("MILLILITRE"));

        System.out.println(q1.equals(q2)); // true

        System.out.println(q1.convertTo(UnitRegistry.get("MILLILITRE"))); // 1000 mL

        System.out.println(q1.add(q2, UnitRegistry.get("LITRE"))); // 2 L
    }
}
