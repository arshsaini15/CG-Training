package Test.StringSection;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = s.length();

        if(n % 2 == 0) {
            String x1 = s.substring(0, n/2);
            String x2 = s.substring(n/2, n);

            if(x1.equals(x2)) {
                System.out.println(x1);
            }
        }
    }
}
