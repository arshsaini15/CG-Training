package CgLevel2;

import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next(), fromCity = sc.next(), viaCity = sc.next(), toCity = sc.next();
        double dist1 = sc.nextDouble(), dist2 = sc.nextDouble();
        double timeTaken = sc.nextDouble();
        double totalDist = dist1 + dist2;
        System.out.println("The results of Travel Operations are " + name + ", " + totalDist + ", and " + timeTaken);
    }
}
