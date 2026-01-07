package Jan_07_2026.Level2;

import java.util.Scanner;

public class FindFactors {
    static int[] findFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++)
            sum += factors[i];
        return sum;
    }

    static long productOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++)
            product *= factors[i];
        return product;
    }

    static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int i = 0; i < factors.length; i++)
            sum += Math.pow(factors[i], 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++)
            System.out.print(factors[i] + " ");

        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
    }
}
