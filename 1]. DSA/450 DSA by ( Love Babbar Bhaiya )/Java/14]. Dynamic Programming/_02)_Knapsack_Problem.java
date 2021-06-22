import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]){

            int n = 3;
            int w = 4;
            
            int val[] = {1,2,3};
            int wt[] = {4,5,1};
            
            System.out.println(knapSack(w, wt, val, n));
        }
    }
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int dp[][] = new int[n+1][W+1];
         for(int i=1 ; i<n+1 ; i++){
             for(int j=1 ; j<W+1 ; j++){
                 if(wt[i-1] <= j){
                     dp[i][j] = Math.max(dp[i-1][j], val[i-1] + dp[i-1][j-wt[i-1]]);
                 }
                 else{
                     dp[i][j] = dp[i-1][j];
                 }
             }
         }
         return dp[n][W];
    } 
}