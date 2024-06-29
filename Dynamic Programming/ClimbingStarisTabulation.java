//Climbing Stairs (Tabulation)
//Count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time

public class ClimbingStarisTabulation {
    public static int Tabulation(int n){
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = dp[i - 1] + 0;
            }
            else{
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }
        public static void main(String[] args) {
        int n = 5; // n = 3 -> 3 & n = 4 -> 5 => 8
        System.out.println(Tabulation(n));
    }
}
