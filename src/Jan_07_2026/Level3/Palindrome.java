package Jan_07_2026.Level3;

public class Palindrome {
    static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverse(digits));
    }

    public static void main(String[] args) {
        int num = 121;
        int[] digits = {1, 2, 1};

        System.out.println("Palindrome: " + isPalindrome(digits));
    }
}
