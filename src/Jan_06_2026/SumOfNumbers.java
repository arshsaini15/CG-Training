package Jan_06_2026;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            sum += num;
            if (num == 0 || num <= 0) {
                break;
            }

            arr[i] = num;
        }

        System.out.println(sum);
    }
}
