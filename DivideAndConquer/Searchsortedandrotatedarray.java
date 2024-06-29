//Search in Roatated Sorted Array
//input: sorted, rotated array with distinct numbers (in ascending order) it is roatated
// at a pivot point. find the index of given element.
//{4,5,6,7,0,1,2}  target = 0;
import java.util.*;
public class Searchsortedandrotatedarray {

    public static int search(int arr[], int target, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei-si)/2; //(si+ei)/2;

        //case FOUND
        if(arr[mid] == target){
            return mid;
        }
        //mid on line 1
        if(arr[si] <= arr[mid]){
            // case a : left
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            else{
                //case b : right
                return search(arr, target, mid+1, ei);
            }
        }
        else{
            //case c : right
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                // case d : left
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; // output ->4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
