//write a program to sort an array in Ascending order
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int n = 10;

        for (int index = 1; index < n; index++) {
            int temp = arr[index];
            int previous_index = index - 1;
            while (previous_index >= 0 && arr[previous_index] > temp) {
                arr[previous_index + 1] = arr[previous_index];
                previous_index--;
            }
            arr[previous_index + 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
