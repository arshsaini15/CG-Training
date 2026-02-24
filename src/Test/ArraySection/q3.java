package Test.ArraySection;

import java.util.Scanner;

public class q3 {

    public static boolean sum(int i, int arr[]) {
        int first = 0, second = 0;

        for(int x=0; x<=i; x++) {
            first += arr[x];
        }

        for(int x=i+1; x<arr.length; x++) {
            second += arr[x];
        }

        return first == second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = arr.length;
        boolean flag = false;
        for(int i=0; i<l; i++) {
            if(sum(i, arr)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
