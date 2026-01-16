package Jan_08_2026_Strings.Level2;

import java.util.Scanner;

public class SplitString {
    public static char[] splitString(String str) {
        char[] arr = new char[str.length()];

        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] c1 = splitString(str);
        char[] c2 = str.toCharArray();

        for(int i=0; i<c1.length; i++){
            if(c1[i]!=c2[i]) {
                System.out.println("Not equal");
            }
        }

    }
}
