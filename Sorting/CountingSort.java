//write a program to Sort an array in Ascending order
import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 1, 8, 7, 4, 3, 1};
        int n = 9;
        int max_element = 0;
        // Find the maximum element in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > max_element) {
                max_element = arr[i];
            }
        }
        // Create a frequency array
        int[] freq = new int[max_element + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]] += 1;
        }
        // Print the sorted elements
        for (int i = 0; i <= max_element; i++) {
            while (freq[i] > 0) {
                System.out.print(i + " ");
                freq[i] -= 1;
            }
        }
    }
}


