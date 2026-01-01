package CgLevel2;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9/5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }
}
