package Jan_02_2026.Level1;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        boolean flag;
        if(num % 5 == 0) {
            flag = true;
        }
        else {
            flag = false;
        }

        System.out.println("Is the number : " + num + " divisible by 5 : " + flag);
    }
}
