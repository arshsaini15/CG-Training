package CgLevel2;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double res1 = a + b * c;
        double res2 = a * b + c;
        double res3 = c + a / b;
        System.out.println("The results of Double Operations are " + res1 + ", " + res2 + ", and " + res3);
    }
}
