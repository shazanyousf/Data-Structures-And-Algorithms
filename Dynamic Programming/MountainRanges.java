//Mountain Ranges
//mountains and valleys             at any moment the no of down strokes cannot be more than number of up strokes
//up strokes /
//down strokes \
import java.util.*;
public class MountainRanges {
    public static int mountainRanges(int n){
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < n + 1; i++){
            //i pairs -> mountain ranges => ci
            for(int j = 0; j < i; j++){
                int inside = dp[j];
                int outside = dp[i - j - 1];
                dp[i] += inside * outside; //ci = ci * ci - j - 1
            }
        }
        // n pairs
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4; //ans - 14
        System.out.println(mountainRanges(n));
    }
}
