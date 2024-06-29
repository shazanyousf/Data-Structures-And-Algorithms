//Write a program for binary search

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int numbers[], int key){

        int start = 0, end = numbers.length-1;

        while(start<=end){

            int mid = (start+end)/2;

            if (numbers[mid]==key){

                return mid;
            }

            if(numbers[mid]<key){

                start = mid+1;
            } 
            
            else{

                end = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int numbers [] = {2,4,6,8,10,12,14};

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter key");

        int key = Sc.nextInt();

        System.out.println("Index for key is : " +binarySearch(numbers, key));

    }

}
