package Jan_02_2026.Level3;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;
        int temp = originalNumber;
        while (temp != 0) {
            int digit = temp % 10;
            sum += (digit * digit * digit);
            temp /= 10;
        }
        if (sum == number) System.out.println("Armstrong Number");
        else System.out.println("Not an Armstrong Number");
    }
}
