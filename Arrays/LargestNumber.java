// Print the largest number in a given array

import java.util.Scanner;

public class LargestNumber {

    public static int getLargest(int numbers[]){

        int largest = Integer.MIN_VALUE;//- infinity

        for(int i = 0; i<numbers.length; i++){

            if(largest<numbers[i]){
                
                largest= numbers[i];
            }

        }

        return largest;

    }

    public static void main(String[] args) {
        
        int numbers[] = {1,2,3,6,4,5};

        System.out.println("Largest value is : " + getLargest(numbers));

    }
    
}
