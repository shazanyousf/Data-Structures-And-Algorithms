// Print x to the power n // Print X^N

import java.util.*;
public class PowerFucntion{

    public static int Power(int x, int n){
        if(n == 0){
            return 1;
        }
        int Xnm1 =Power(x, n-1);
        int Xn = x*Xnm1;
        return Xn;
        // return x*Power(x, n-1);
    }
    public static void main(String [] args){
        System.out.println(Power(2, 10));
    }
}