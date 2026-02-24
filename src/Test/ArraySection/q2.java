package Test.ArraySection;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int prev = arr[0];
        for (int i=0; i<n; i+=2) {
            if(i+2 < n) {
                int temp = arr[i+2];
                arr[i+2] = prev;
                prev = temp;
            }
            else {
                arr[0] = prev;
            }
        }

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
