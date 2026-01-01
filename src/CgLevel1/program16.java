package CgLevel1;

import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of possible handshakes for " + n + " students is " + handshakes);
    }
}
