package Jan_07_2026.Level3;

public class HarshadNumber {
    static int[] storeDigits(int n) {
        int count = String.valueOf(n).length();
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += d;
        return sum;
    }

    static boolean isHarshad(int num, int[] digits) {
        return num % sumDigits(digits) == 0;
    }

    static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        for (int d : digits)
            freq[d][1]++;

        return freq;
    }

    public static void main(String[] args) {
        int num = 21;
        int[] digits = storeDigits(num);

        System.out.println("Harshad Number: " + isHarshad(num, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++)
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
    }
}
