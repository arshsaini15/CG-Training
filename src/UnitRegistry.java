import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class UnitRegistry {

    private static final Map<String, Unit> units = new HashMap<>();

    public static void register(String name, String category, double factor) {
        units.put(name, new Unit(name, category, BigDecimal.valueOf(factor)));
    }

    public static Unit get(String name) {
        if (!units.containsKey(name)) {
            throw new IllegalArgumentException("Unit not found: " + name);
        }
        return units.get(name);
    }
}