package Level1;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int forSum = 0;
            for (int i = 1; i <= n; i++) { forSum += i; }
            System.out.println("Formula Result: " + formulaSum + ", For Result: " + forSum);
        }
    }
}
