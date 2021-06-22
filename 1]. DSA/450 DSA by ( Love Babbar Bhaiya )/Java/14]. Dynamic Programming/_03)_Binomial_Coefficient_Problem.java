import java.io.*;
import java.lang.*;

class Solution{
    public static void main(String args[])
    {
        int n = 3;
        int r = 2;
            
        System.out.println(nCr(n, r));
    }
    static int nCr(int n, int r)
    {
        // code here
        int M = (int)(1e9+7);
        int dp[][] = new int[n+1][r+1];
        for(int i=0 ; i<n+1 ; i++){
            for(int j=0 ; j <= Math.min(i,r) ; j++){
                if(j==0 || j==i) dp[i][j] = 1;
                else{
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % M;
                }
            }
        }
        return dp[n][r];
    }
}