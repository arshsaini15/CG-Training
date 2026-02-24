package Test.StringSection;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String str[] = s.split("\\s+");
        for(int i=0; i<str.length; i+=2) {
            StringBuilder x = new StringBuilder(str[i]).reverse();
            str[i] = x.toString();
        }

        for(int i=0; i<str.length; i++) {
            if(i+1 < str.length) {
                System.out.println(str[i] + " ");
            }
            else {
                System.out.println(str[i]);
            }
        }
    }
}
