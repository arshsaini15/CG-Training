package Jan_08_2026_Strings.Level2;

import java.util.Scanner;

public class ShortestLongestWord {
    public static String[] splitWords(String text) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
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

    // Find string length without using length()
    public static int findLength(String word) {
        int len = 0;
        for (char c : word.toCharArray()) {
            len++;
        }
        return len;
    }

    // Create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    // Find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] table) {
        int minIndex = 0;
        int maxIndex = 0;

        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);

            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }

            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] table = createWordLengthTable(words);
        int[] result = findShortestAndLongest(table);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(
                    table[i][0] + "\t" + Integer.parseInt(table[i][1])
            );
        }

        System.out.println("\nShortest word: "
                + table[result[0]][0]
                + " (" + table[result[0]][1] + ")");

        System.out.println("Longest word: "
                + table[result[1]][0]
                + " (" + table[result[1]][1] + ")");
    }
}
