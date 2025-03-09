package problemsolving;

// Flood Fill Algorithm
// https://leetcode.com/problems/flood-fill/description/
// https://www.geeksforgeeks.org/flood-fill-algorithm/

import java.util.Arrays;

public class Leetcode733 {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 1, 1},
                {0, 0, 1, 1}
        };

        printImage(image);
        int[][] result = floodFill(image, 0, 0, 2);
        printImage(result);
    }

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
            return image;

        helper(image, sr, sc, image[sr][sc], color);
        return image;
    }

    static void helper(int[][] image, int row, int col, int oldColor, int newColor) {
        if (row < 0 || col < 0 || row >= image.length || col >= image[0].length)
            return;

        if (image[row][col] != oldColor)
            return;

        image[row][col] = newColor;

        helper(image, row + 1, col, oldColor, newColor);
        helper(image, row - 1, col, oldColor, newColor);
        helper(image, row, col + 1, oldColor, newColor);
        helper(image, row, col - 1, oldColor, newColor);
    }

    static void printImage(int[][] image) {
        for (int[] row : image)
            System.out.println(Arrays.toString(row));
    }
}
