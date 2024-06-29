//Kadanes Sub Array Sum
import java.util.Scanner;
public class MaxSubArray3 {
    public static void Kadanes(int [] numbers){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i<numbers.length; i++){
            currSum = currSum + numbers [i];
            if (currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Our Maximum Sub Array is : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5};
        Kadanes(numbers);
    }
    
}
