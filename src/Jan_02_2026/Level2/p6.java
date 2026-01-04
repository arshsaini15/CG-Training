package Jan_02_2026.Level2;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt(), age2 = sc.nextInt(), age3 = sc.nextInt();
        double h1 = sc.nextDouble(), h2 = sc.nextDouble(), h3 = sc.nextDouble();

        int youngestAge = Math.min(age1, Math.min(age2, age3));
        double tallestHeight = Math.max(h1, Math.max(h2, h3));

        System.out.println("The youngest age is " + youngestAge);
        System.out.println("The tallest height is " + tallestHeight);
    }
}
