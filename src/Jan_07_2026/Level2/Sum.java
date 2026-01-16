package Jan_07_2026.Level2;

import java.util.Scanner;

public class Sum {
    static int recursiveSum(int n) {
        if (n == 0)
            return 0;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int recResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Recursive Sum: " + recResult);
        System.out.println("Formula Sum: " + formulaResult);

        if (recResult == formulaResult)
            System.out.println("Both results are correct");
        else
            System.out.println("Results do not match");
    }
}
