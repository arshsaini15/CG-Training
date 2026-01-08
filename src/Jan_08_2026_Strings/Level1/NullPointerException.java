package Jan_08_2026_Strings.Level1;

public class NullPointerException {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        }
        catch(java.lang.NullPointerException e) {
            System.out.println("String is null, " + e.getMessage());
        }
    }
}
