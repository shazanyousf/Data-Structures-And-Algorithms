//Merge sort
import java.util.*;
public class MergeSort{
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return ;
        }
        //Kaam
        int mid = si + (ei-si)/2; // or we can write (si+ei)/2
        mergeSort(arr, si, mid);  // left part
        mergeSort(arr, mid+1, ei);  // right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp [] = new int[ei-si+1];
        int i = si;  // iterator for left part
        int j = mid + 1;  // iterator for rigth part
        int k = 0;  // iterator for temp arr

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for leftlover elements of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        // for leftover elements of 2nd sorted part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,1,3,7,100,-9};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}