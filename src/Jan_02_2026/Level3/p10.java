package Jan_02_2026.Level3;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        String op = sc.next();

        double result = 0;
        switch (op) {
            case "+": result = first + second; break;
            case "-": result = first - second; break;
            case "*": result = first * second; break;
            case "/":
                if (second != 0) result = first / second;
                else { System.out.println("Error: Division by zero"); return; }
                break;
            default: System.out.println("Invalid Operator"); return;
        }
        System.out.println("Result: " + result);
    }
}
