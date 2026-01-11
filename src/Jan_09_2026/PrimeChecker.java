package Jan_09_2026;

import java.util.Scanner;

public class PrimeChecker {

    public static int getNumber(Scanner scanner) {
        int number = 0;
        while (true) {
            System.out.print("Enter a positive integer to check if it's prime: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        // Check divisors from 5 to sqrt(number)
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void displayResult(int number, boolean isPrime) {
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Prime Number Checker ===");
        int number = getNumber(scanner);
        boolean primeResult = isPrime(number);
        displayResult(number, primeResult);

        scanner.close();
    }
}