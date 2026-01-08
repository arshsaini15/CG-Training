package Jan_08_2026_Strings.Level1;

import java.util.Scanner;

public class CharacterArray {

    public static char[] toArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    public static char[] toCharacterArray(String str) {
        return str.toCharArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        char[] a1 = toArray(str1);
        char[] a2 = toCharacterArray(str1);

        boolean flag = true;
        for(int i=0; i<a1.length; i++) {
            if(a1[i] != a2[i]) {
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
