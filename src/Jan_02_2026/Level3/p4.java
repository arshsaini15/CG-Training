package Jan_02_2026.Level3;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        boolean isPrime = true;
        if (number <= 1) isPrime = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + (isPrime ? " is Prime" : " is not Prime"));
    }
}
