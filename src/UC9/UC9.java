package UC9;

public class UC9 {
    public static void main(String[] args) {

        QuantityWeight a = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight b = new QuantityWeight(1000.0, WeightUnit.GRAM);

        System.out.println(a.equals(b)); // true

        System.out.println(a.convertTo(WeightUnit.POUND)); // ~2.20462 lb

        System.out.println(a.add(b)); // 2 kg

        System.out.println(a.add(b, WeightUnit.GRAM)); // 2000 g

        QuantityWeight c = new QuantityWeight(2.0, WeightUnit.POUND);
        QuantityWeight d = new QuantityWeight(1.0, WeightUnit.KILOGRAM);

        System.out.println(c.add(d, WeightUnit.POUND)); // ~4.409 lb
    }
}
