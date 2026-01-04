package Jan_02_2026.Level3;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number);
        if (temp == 0) count = 1;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
