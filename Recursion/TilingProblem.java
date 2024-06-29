//Given a "2*n" board & tiles of size "2*1", count the number of ways to tile the given
//board using the "2*1" tiles. (A tile can either be placed horizontally or vertically)

// This Question was asked in AMAZON Company

import java.util.*;
public class TilingProblem{
    public static int tilingProblem(int n){    //2*n floor size
        if(n == 0 || n == 1){
            return 1;    //base case
        }
        //Kaam
        //Vertical Choice
        int fnm1 = tilingProblem(n-1);
        //Horizontal Choice
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(2));
    }
}