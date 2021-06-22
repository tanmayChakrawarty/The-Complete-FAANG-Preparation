import java.io.*;
import java.util.*;

class Solution{
    
    public static void main(String args[]){
        int n = 4;
        int m = 3;
        int Arr[] = {1,2,3};
                    
        System.out.println(count(Arr,m,n));
    }

    public long count(int coins[], int m, int amount) { 
        //code here.
        long dp[] = new long[amount+1];
        dp[0]=1;
        for(int j=0 ; j<coins.length ; j++){
            for(int i=coins[j] ; i<amount+1 ; i++){
                dp[i] = dp[i] + dp[i-coins[j]];
            }
        }
        return dp[amount];
    }
} 