package Jan_08_2026_Strings.Level3;

import java.util.Scanner;

public class BMITracker {
    public static String[] calculateBMIAndStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4) {
            status = "UnderWeight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }

    public static String[][] generateBMITable(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiData = calculateBMIAndStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }

        return result;
    }

    // Method to display table
    public static void displayTable(String[][] table) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < table.length; i++) {
            System.out.println(
                    table[i][0] + "\t\t" +
                            table[i][1] + "\t\t" +
                            table[i][2] + "\t" +
                            table[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] input = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            input[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            input[i][1] = sc.nextDouble();
        }

        String[][] bmiTable = generateBMITable(input);
        displayTable(bmiTable);

        sc.close();
    }
}
