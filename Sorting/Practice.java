// Write a program for counting sort

// public class Practice{
//     public static void main(String[] args) {
//         int arr [] = {10,9,6,8,4,12,5,1,0,7};
//         int n = 10;
//         int max_Element = 0;
//         for(int i = 0; i<n; i++){
//             if(arr[i]>max_Element){
//                 max_Element = arr[i];
//             }
//         }
//         int freq [] = new int[max_Element+1];
//         for(int i = 0; i<n; i++){
//             freq[arr[i]] += 1;
//         }
//         for(int i = 0; i<= max_Element; i++){
//             while(freq[i]>0){
//                 System.out.print(i+" ");
//                 freq[i]-=1;
//             }
//         }
//     }
// }



//Write a program for insertion sort
// public class Practice{
//     public static void main(String[] args) {
//         int arr [] = {10,9,6,8,4,12,5,1,0,7};
//         int n = 10;
//         for(int index = 1; index<n; index++){
//             int temp = arr[index];
//             int prev = index-1;
//             while(prev >= 0 && arr[prev]>temp){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             arr[prev+1] = temp;
//         }
//         for(int i = 0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }



//Write a program for selection Sort
// public class Practice{
//     public static void main(String[] args) {
//         int arr [] = {10,9,6,8,4,12,5,1,0,7};
//         int n = 10;
//         for(int index = 0; index<n; index++){
//             int max_Element = arr[index];
//             int max_index = index;
//             for(int i = index + 1; i<n; i++){
//                 if(arr[i]<max_Element){
//                     max_Element = arr[i];
//                     max_index = i;
//                 }
//             }
//             int temp = arr[index];
//             arr[index] = arr[max_index];
//             arr[max_index] = temp;
//         }
//         for(int i = 0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }




// //Write a program for bubble sort
// public class Practice{
//     public static void main(String[] args) {
//         int arr [] = {10,9,6,8,4,12,5,1,0,7};
//         int n = 10;
//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<n-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[i];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for(int i = 0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }





//Write a program for merger sort
// public class Practice{
//     public static void main (String[] args){
// 	    int[] arr = { 7 , 6 , 2 , 1 , 9 , 5, 4 , 3 , 8};
//         divide(arr, 0, 8);
//         int n = 9;
//         for(int i = 0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void merge(int arr[], int start, int mid, int end){
//         int p1 = start;
//         int p2 = mid+1;
//         int size = end -start+1;
//         int temp [] = new int[size];
//         int i = 0;
//         while(p1<= mid && p2<= end){
//             if(arr[p1]<arr[p2]){
//                 temp[i] = arr[p1];
//                 i++;
//                 p1++;
//             }
//             else{
//                 temp[i] = arr[p2];
//                 i++;
//                 p2++;
//             }
//         }
//         while(p1<=mid){
//             temp[i] = arr[p1];
//             i++;
//             p1++;
//         }
//         while(p2<=end){
//             temp[i] = arr[p2];
//             i++;
//             p2++;
//         }
//         for(int k = 0; k<size; k++){
//             arr[start+k] = temp[k];
//         }
//     }
//     public static void divide(int arr[], int start, int end){
//         if(start == end){
//             return;
//         }
//         int mid = (start + end)/2;
//         divide(arr, start, mid);
//         divide(arr, mid+1, end);
//         merge(arr, start, mid, end);
//     }
// }




//Write a program for Quick Sort
public class Practice{
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
        int partitionIndex = partition(arr, low, high);
        quickSort(arr, low, partitionIndex-1);
        quickSort(arr, partitionIndex+1, high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j<high; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void printArray(int arr[]){
        for(int i : arr) {
        System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,5,2,3,1,4,6};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}