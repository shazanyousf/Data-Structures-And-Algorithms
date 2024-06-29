// Quick Sort
import java.util.*;
public class QuickSort{

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pIdx = parition( arr, si, ei);
            quickSort(arr, si, pIdx-1);//left
            quickSort(arr, pIdx+1, ei);//right
        }

        public static int parition(int arr[], int si, int ei){
            int pivot = arr[ei];
            int i = si-1; //to make place for the elements smaller than pivot
            for(int j = 0; j<ei; j++){
                if(arr[j] <= pivot){
                    i++;
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            i++;
            int temp = pivot;
            arr[ei] = arr[i];
            arr[i] = temp;
            return i;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,5,7,1,3,5,8};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}