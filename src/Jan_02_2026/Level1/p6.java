package Jan_02_2026.Level1;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) System.out.println("positive");
        else if (number < 0) System.out.println("negative");
        else System.out.println("zero");
    }
}
