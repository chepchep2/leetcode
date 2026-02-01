package problems_test;

import problems.Problem733;
import problems.Problem733_re;

import java.util.Arrays;

public class Problem733Test {
    public static void main(String[] args) {
        Problem733 sol = new Problem733();
        Problem733_re sol2 = new Problem733_re();

        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] result = sol2.floodFill(image, sr, sc, color);
        System.out.println("Test 1:");
        System.out.println("Expected: [[2, 2, 2],[2, 2, 0],[2, 0, 1]]");
        System.out.println("Output: " + Arrays.deepToString(result));
        System.out.println();

        image = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        sr = 0;
        sc = 0;
        color = 0;
        result = sol2.floodFill(image, sr, sc, color);
        System.out.println("Test 2:");
        System.out.println("Expected: [[0, 0, 0],[0, 0, 0],[0, 0, 0]]");
        System.out.println("Output: " + Arrays.deepToString(result));
        System.out.println();

    }
}
