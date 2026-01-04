package Jan_02_2026.Level3;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int heightCm = sc.nextInt();
        int weightKg = sc.nextInt();

        double heightInMeters = heightCm / 100;
        double bmi = weightKg / (heightInMeters * heightInMeters);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal weight";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";

        System.out.printf("BMI: %.2f - Status: %s\n", bmi, status);
    }
}
