public class UC13 {

    public static class Feet {
        private double value;

        public Feet(double value) {
            if (Double.isNaN(value)) {
                throw new IllegalArgumentException("Invalid input for Feet");
            }
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || !(obj instanceof Feet)) return false;

            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    public static class Inches {
        private double value;

        public Inches(double value) {
            if (Double.isNaN(value)) {
                throw new IllegalArgumentException("Invalid input for Inches");
            }
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || !(obj instanceof Inches)) return false;

            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    public static void demonstrateFeetEquality() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        Feet f3 = new Feet(2.0);

        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + f1.equals(f2) + ")");

        System.out.println("Input: 1.0 ft and 2.0 ft");
        System.out.println("Output: Equal (" + f1.equals(f3) + ")");
    }

    public static void demonstrateInchesEquality() {
        Inches i1 = new Inches(1.0);
        Inches i2 = new Inches(1.0);
        Inches i3 = new Inches(2.0);

        System.out.println("Input: 1.0 inch and 1.0 inch");
        System.out.println("Output: Equal (" + i1.equals(i2) + ")");

        System.out.println("Input: 1.0 inch and 2.0 inch");
        System.out.println("Output: Equal (" + i1.equals(i3) + ")");
    }

    public static void main(String[] args) {
        Length l1 = new Length(1, Length.LengthUnit.Feet);
        Length l2 = new Length(12, Length.LengthUnit.Inches);

        System.out.println(l1.equals(l2)); // should print true
    }
}