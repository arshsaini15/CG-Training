package Level2;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) System.out.println(i + " is even");
                else System.out.println(i + " is odd");
            }
        }
    }
}
