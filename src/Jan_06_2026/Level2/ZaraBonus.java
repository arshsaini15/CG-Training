package Jan_06_2026.Level2;

import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] serviceYears = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary and years of service for employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            double years = sc.nextDouble();

            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }
            salaries[i] = sal;
            serviceYears[i] = years;
        }

        for (int i = 0; i < 10; i++) {
            double bonusPercent = (serviceYears[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercent;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}