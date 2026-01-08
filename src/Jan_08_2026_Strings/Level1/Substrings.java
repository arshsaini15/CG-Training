package Jan_08_2026_Strings.Level1;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        StringBuilder sb1 = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb1.append(str1.charAt(i));
        }

        StringBuilder sb2;
        sb2 = new StringBuilder(str1.substring(start, end+1));

        String s1 =  sb1.toString();
        String s2 =  sb2.toString();

        if (s1.equals(s2)) {
            System.out.println("s1 equal s2");
        } else{
            System.out.println("s1 not equals s2");
        }
    }
}
