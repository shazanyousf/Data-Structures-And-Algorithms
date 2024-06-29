//0 - 1 Knapsack(Tabulation)

public class KnapsackTabulation {
    public static int Tabulation(int val[], int wt[], int w){
        int n  = val.length;
        int dp[][] = new int[n + 1][w + 1];
        for(int i = 0; i < dp.length; i++){  //0th col
            dp[i][0] = 0;
        }
        for(int j = 0; j < dp[0].length; j++){   //0th row
            dp[0][j] = 0;
        }
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < w + 1; j++){
                int v = val[i - 1]; //ith item val
                int W = wt[i - 1]; //ith item wt
                if(W <= j){ //Valid
                    int incProfit = v + dp[i - 1][j - W]; 
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                }
                else{ //Invalid
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int w = 7;
        System.out.println(Tabulation(val, wt, w)); 
    }
}
