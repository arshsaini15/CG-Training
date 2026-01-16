package Jan_02_2026.Level3;

import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (number % sum == 0) System.out.println("Harshad Number");
        else System.out.println("Not a Harshad Number");
    }
}
