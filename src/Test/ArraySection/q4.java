package Test.ArraySection;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                max = Math.max(max, arr[j]-arr[i]);
            }
        }

        System.out.println(max);
    }
}
