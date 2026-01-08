package Jan_08_2026_Strings.Level1;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() == s2.length()){
            boolean flag = true;
            for(int i=0; i<s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    flag = false;
                }
            }
            System.out.println("s1 equal to s2 : " + flag);
        }
        else {
            System.out.println("s1 != s2");
        }


        if(s1.equals(s2)) {
            System.out.println("s1.equals s2");
        }
        else {
            System.out.println("s1 not equals s2");
        }
    }
}
