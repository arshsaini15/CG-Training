package CgLevel2;

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfchocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();
        int eachGets = numberOfchocolates / numberOfChildren;
        int remaining = numberOfchocolates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + eachGets +
                " and the number of remaining chocolates are " + remaining);
    }
}
