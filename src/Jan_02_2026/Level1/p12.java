package Jan_02_2026.Level1;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int whileSum = 0, i = 1;
            while (i <= n) { whileSum += i; i++; }
            System.out.println("Formula Result: " + formulaSum + ", While Result: " + whileSum);
        }
    }
}
