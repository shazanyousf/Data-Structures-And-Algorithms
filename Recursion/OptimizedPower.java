//Print X^n in o(logn)
import java.util.*;

public class OptimizedPower {
    public static int OptimizedPower(int a, int n){
       
        //base case
        if(n == 0){
            return 1;
        }
        int halfPowerSq = OptimizedPower(a, n/2)*OptimizedPower(a, n/2);
         
        // n is odd
        if(n%2 != 0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(OptimizedPower(a, n));
    }
}
