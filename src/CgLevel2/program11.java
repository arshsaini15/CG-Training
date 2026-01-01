package CgLevel2;

import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble(), rate = sc.nextDouble(), time = sc.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + si + " for Principal " + principal +
                ", Rate of Interest " + rate + " and Time " + time);
    }
}
