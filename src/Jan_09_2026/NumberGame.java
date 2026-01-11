package Jan_09_2026;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 57;

        System.out.print("Guess a number between 1 and 100 : ");
        int n = sc.nextInt();

        if(n < 57) {
            System.out.println("Number is less than original number");
        }
        else if(n > 57) {
            System.out.println("Number is greater than original number");
        }
        else {
            System.out.println("Correct !");
        }
    }
}
