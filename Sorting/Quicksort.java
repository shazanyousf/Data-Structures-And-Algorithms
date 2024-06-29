public class Quicksort {
    
    // Function to perform Quick Sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array
            int partitionIndex = partition(array, low, high);
            
            // Recursively sort elements before and after partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Function to partition the array
    public static int partition(int[] array, int low, int high) {
        // Select the pivot element (here, we choose the last element)
        int pivot = array[high];
        
        // Index of the smaller element
        int i = low - 1;
        
        // Traverse through the array
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        // Return the partition index
        return i + 1;
    }

    // Utility function to print an array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;
        System.out.println("Original array:");
        printArray(array);
        quickSort(array, 0, n - 1);
        System.out.println("Sorted array:");
        printArray(array);
    }
}
