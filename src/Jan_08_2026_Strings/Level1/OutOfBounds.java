package Jan_08_2026_Strings.Level1;

public class OutOfBounds {
    public static void main(String[] args) {
        try {
            String text = "abc";
            System.out.println(text.charAt(3));
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        }
    }
}
