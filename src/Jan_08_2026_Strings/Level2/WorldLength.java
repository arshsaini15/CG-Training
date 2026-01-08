package Jan_08_2026_Strings.Level2;

import java.util.Scanner;

public class WorldLength {
    public static String[] splitWords(String text) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[count];
        String temp = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                temp += ch;
            } else if (!temp.equals("")) {
                words[index++] = temp;
                temp = "";
            }
        }

        if (!temp.equals("")) {
            words[index] = temp;
        }

        return words;
    }

    public static int findLength(String word) {
        int len = 0;
        for (char c : word.toCharArray()) {
            len++;
        }
        return len;
    }

    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] result = createWordLengthTable(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + length);
        }
    }
}
