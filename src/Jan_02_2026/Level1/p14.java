package Jan_02_2026.Level1;

import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            long fact = 1; int i = 1;
            while (i <= n) { fact *= i; i++; }
            System.out.println("Factorial of " + n + " is " + fact);
        }
    }
}
