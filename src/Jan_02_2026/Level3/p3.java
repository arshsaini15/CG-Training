package Jan_02_2026.Level3;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();

        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100;
        String grade, remarks;

        if (percentage >= 80) {
            grade = "A"; remarks = "Level 4: Above Agency Levels";
        }
        else if (percentage >= 70) {
            grade = "B"; remarks = "Level 3: At Agency Levels";
        }
        else if (percentage >= 60) {
            grade = "C"; remarks = "Level 2: Below Agency Levels";
        }
        else if (percentage >= 50) {
            grade = "D"; remarks = "Level 1: Well Below Agency Levels";
        }
        else {
            grade = "E"; remarks = "Level R: Remedial Standards";
        }

        System.out.println("Average Mark: " + (total/3) + "\nGrade: " + grade + "\nRemarks: " + remarks);
    }
}
