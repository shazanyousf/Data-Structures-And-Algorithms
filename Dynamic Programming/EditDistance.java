// //Edit Distance
// //Given two Strings word1 & word2, return the minimum number of operations required to convert word1 to word2.
// //Youo have the following operations permitted on a word:
// //Insert a character
// //Delete a character
// //Replace a character

import java.util.*;

public class EditDistance {
    public static int editDis(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        // Initialize the base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i; 
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j; 
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) { // Same character
                    dp[i][j] = dp[i - 1][j - 1];
                } else { // Different character
                    int add = dp[i][j - 1] + 1; // Insert
                    int del = dp[i - 1][j] + 1; // Delete
                    int rep = dp[i - 1][j - 1] + 1; // Replace
                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(editDis(word1, word2)); // Expected output: 5
    }
}

