//Write a program to find the last occurence of an element in an arrray
import java.util.*;
public class LastOccurence {
    public static int lastOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
            int isFound = (lastOcc(arr, key, i+1));
            if(isFound == -1 && arr[i] == key){
                return i;
            }
            return isFound;
        
    }
        

    public static void main(String[] args) {
        int  arr [] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOcc(arr, 5, 0));
    }
    
}