package CgLevel1;

import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is " + area);
    }
}
