package Jan_07_2026.Level3;

public class NumberChecker {
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] storeDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d != 0)
                return true;
        return false;
    }

    static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits)
            sum += Math.pow(d, power);

        return sum == num;
    }

    static void largestSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        System.out.println("Largest: " + max + ", Second Largest: " + second);
    }

    static void smallestSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        System.out.println("Smallest: " + min + ", Second Smallest: " + second);
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = storeDigits(num);

        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong Number: " + isArmstrong(num, digits));
        largestSecondLargest(digits);
        smallestSecondSmallest(digits);
    }
}
