package Test.ArraySection;

import java.util.HashMap;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        if(s.length() % 2 == 0) {
            for(int values : map.values()) {
                if(values % 2 != 0) {
                    System.out.println("False");
                    return;
                }
            }
        }
        else {
            int count = 0;
            for(int values : map.values()) {
                if(values % 2 != 0) {
                    count++;
                }
            }

            if(count > 1) {
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }
}
