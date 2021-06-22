import java.io.*;
import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        int n = 3;
        int m = 3;
        int M[][] = { {1, 3, 3},
                      {2, 1, 4},
                      {0, 6, 4} };
    
        System.out.println(maxGold(n,m,M));
       
    }
    static int maxGold(int n, int m, int M[][])
    {
        int dp[][] = new int[n+2][m+2];
        for(int[] rows : dp){
            Arrays.fill(rows, 0);   
        }
        for(int col = 1 ; col<=m ; col++){
            for(int row=1 ; row<=n ; row++){
                dp[row][col] = M[row-1][col-1] + Math.max(dp[row][col-1],Math.max(dp[row-1][col-1],dp[row+1][col-1]));
            }
        }
        int max = 0;
        for(int i=1 ; i<=n ; i++){
            max = Math.max(max,dp[i][m]);
        }
        return max;
    }
}  