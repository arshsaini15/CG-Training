package Test.ArraySection;

import java.util.Scanner;
import java.util.Stack;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);

        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i] > stack.peek()) {
                stack.push(arr[i]);
            }
        }

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
