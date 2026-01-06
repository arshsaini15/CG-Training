package Jan_06_2026;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++) {
            if(arr[i] < 0) {
                System.out.println("Invalid Age");
            }
            else if(arr[i] >= 18) {
                System.out.println("The student with the age "+  arr[i] + " can vote. ");
            }
            else {
                System.out.println("The student with the age "+  arr[i] + " cannot vote. ");
            }
        }
    }
}
