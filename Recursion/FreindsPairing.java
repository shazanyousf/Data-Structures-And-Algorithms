//Friends Pairing Problem
//Given n friends, each one can remain single or can be paired up with some other friends. Each Friend can be paired only once.
// Find out the toal number of ways in which friends can remain single or can be paired up.
    //This question was asked in GOLDMAN SACHS company
import java.util.*;
public class FreindsPairing {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }

        //choice
        //Single
        int fnm1 = friendsPairing(n-1);

        // pair

        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;
        //Total ways

        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }

    
}
