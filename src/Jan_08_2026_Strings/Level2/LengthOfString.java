package Jan_08_2026_Strings.Level2;

import java.util.Scanner;

public class LengthOfString {

    public static int manually(String s) {
        int length = 0;
        for(int i = 0; i < s.length(); i++) {
            length++;
        }
        return length;
    }

    public static int inbuilt(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int l1 = manually(str), l2= inbuilt(str);

        System.out.println(l1 == l2);
    }
}
