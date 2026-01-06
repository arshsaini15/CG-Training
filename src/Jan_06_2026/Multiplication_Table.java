package Jan_06_2026;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] multiplicationResult = new int[4];
        int start = 6;

        for(int i=0; i<4; i++){
            multiplicationResult[i] = n * (start++);
        }

        start = 6;

        for(int i=0; i<4; i++) {
            System.out.println(n + " * " + (start++) + " : " + multiplicationResult[i]);
        }
    }
}
