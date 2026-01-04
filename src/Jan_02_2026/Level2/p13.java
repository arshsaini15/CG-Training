package Jan_02_2026.Level2;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 99;
        while (counter > 1) {
            if (counter % number == 0) System.out.print(counter + " ");
            counter--;
        }
    }
}
