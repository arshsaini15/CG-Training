package Jan_09_2026;

import java.util.Scanner;

public class MaxOfThree {
    public static int[] getNumbers(Scanner scanner) {
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            while (true) {
                try {
                    numbers[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter an integer: ");
                }
            }
        }
        return numbers;
    }

    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void displayResult(int[] numbers, int maximum) {
        System.out.println("The maximum of " + numbers[0] + ", " +
                numbers[1] + ", and " + numbers[2] + " is: " + maximum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Maximum of Three Numbers ===");
        int[] numbers = getNumbers(scanner);
        int maximum = findMaximum(numbers);
        displayResult(numbers, maximum);

    }
}
