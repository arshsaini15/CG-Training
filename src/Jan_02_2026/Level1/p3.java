package Jan_02_2026.Level1;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        boolean isSmallest = (n1 < n2 && n1 < n3);
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
