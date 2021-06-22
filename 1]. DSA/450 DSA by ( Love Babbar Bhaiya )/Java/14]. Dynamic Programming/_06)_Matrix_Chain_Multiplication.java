import java.io.*;
import java.util.*;

class Solution{

    public static void main(String args[])
    {
        int n = 5;
        int arr[] = {40, 20, 30, 10, 30};
        int dp[][] = new int[n+1][n+1];
        for(int row[]: dp)
            Arrays.fill(row,-1);
        int i = 1;
        int j = n-1;
        System.out.println(matrixMultiplication(n,arr,i,j,dp));
    }
    static int matrixMultiplication(int n, int arr[],i,j,int[][] dp)
    {
        if(i>=j)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        int min = Integer.MAX_VALUE;    
        for(int k=i;k<=j-1;k++){
            int temp = solve(arr,i,k) + solve(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
            if(temp < min){
                min = temp;
                dp[i][j] = temp;
            }
        }
        return min;
    }
}