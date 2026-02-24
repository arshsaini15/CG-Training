package Test.StringSection;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();

        StringBuilder s = new StringBuilder();

        int index1 = 0, index2 = 0;

        while(index1 < x.length() && index2 < y.length()) {
            s.append(x.charAt(index1++));
            s.append(y.charAt(index2++));
        }

        while(index1 < x.length()) {
            s.append(x.charAt(index1++));
        }

        while(index2 < y.length()) {
            s.append(y.charAt(index2++));
        }

        System.out.println(s.toString());
    }
}
