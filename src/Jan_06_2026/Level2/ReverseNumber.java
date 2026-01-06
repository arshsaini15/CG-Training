package Jan_06_2026.Level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int count = String.valueOf(num).length();
        int[] digits = new int[count];
        int[] reversed = new int[count];

        int temp = num;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < count; i++) {
            reversed[i] = digits[i];
        }

        System.out.print("Reversed Array Elements: ");
        for (int val : reversed) {
            System.out.print(val + " ");
        }
    }
}