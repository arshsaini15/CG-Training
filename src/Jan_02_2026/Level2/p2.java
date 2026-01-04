package Jan_02_2026.Level2;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is INR " + bonus);
        } else {
            System.out.println("No bonus awarded.");
        }
    }
}
