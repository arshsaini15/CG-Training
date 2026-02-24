package Test.StringSection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;

        int i=0, j=0, n=s.length();
        while(j < n) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while(map.size() < j-i+1) {
                char ch = s.charAt(i);
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0) map.remove(ch);
                i++;
            }

            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }

        System.out.println(maxLen);
    }
}
