//Flood Fill Algorithm

//Given a m x n integer grid image where image[i][j] represents the pixel value of the image. You are also given three integers 
//sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

//To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same 
//color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace
//the color of all of the aforementioned pixels with color
import java.util.*;

public class FloodFillAlgorithm {
    static void floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length;
        int n = image[0].length;
        int originalColor = image[sr][sc];
        if (originalColor == newColor)
            return;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});
        image[sr][sc] = newColor;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] pixel = queue.poll();
            for (int[] dir : directions) {
                int newRow = pixel[0] + dir[0];
                int newCol = pixel[1] + dir[1];
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n
                        && image[newRow][newCol] == originalColor) {
                    image[newRow][newCol] = newColor;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;
        floodFill(image, sr, sc, newColor);

        // Print the updated image
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
