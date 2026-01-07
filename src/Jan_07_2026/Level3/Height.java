package Jan_07_2026.Level3;

import java.util.Random;

public class Height {
    static int sum(int[] heights) {
        int s = 0;
        for (int i = 0; i < heights.length; i++)
            s += heights[i];
        return s;
    }

    static double mean(int[] heights) {
        return (double) sum(heights) / heights.length;
    }

    static int shortest(int[] heights) {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++)
            if (heights[i] < min)
                min = heights[i];
        return min;
    }

    static int tallest(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > max)
                max = heights[i];
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();

        for (int i = 0; i < heights.length; i++)
            heights[i] = 150 + r.nextInt(101); // 150–250

        System.out.print("Heights: ");
        for (int h : heights)
            System.out.print(h + " ");

        System.out.println("\nShortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
        System.out.println("Mean Height: " + mean(heights));
    }
}
