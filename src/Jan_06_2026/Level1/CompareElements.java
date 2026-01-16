package Jan_06_2026.Level1;

import java.util.Scanner;

public class CompareElements {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<5;i++) {
            if(arr[i] > 0) {
                if(arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is a even number");
                }
                else {
                    System.out.println(arr[i] + " is a odd number");
                }
            }
            else if(arr[i] < 0) {
                System.out.println(arr[i] + " is a negative number");
            }
            else {
                System.out.println("number is zero");
            }
        }
    }
}
