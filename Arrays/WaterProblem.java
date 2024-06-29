//Given n non-negative integers representing an elevation
// map where the width of each bar is 1, compute how much
//water it can trap after raining 

import java.util.Scanner;

public class WaterProblem{
    public static int trappedRainWater(int height[]) {
        int n = height.length;

        // Calculate left max boundary-array (auxiliary arrays)
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate Right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];  // Fix here
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        // loop
        for (int i = 0; i < n; i++) {
            // water level = min(left maximum boundary, right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // Trapped water = water level - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
}
