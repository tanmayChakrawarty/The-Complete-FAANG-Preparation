import java.io.*;
import java.util.*;

class Solution{
    public static void main(String args[])
    {
        int N = 4;
        int arr[] = {1, 5, 11, 5};

        int x = equalPartition(N, arr);
        if(x == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
    static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for(int i=0 ; i<N ; i++){
            sum += arr[i];
        }
        if(sum % 2 != 0){
            return 0;
        }
        else{
            return subSum(N,arr,sum/2);
        }
    }
    static int subSum(int n,int a[],int sum){
        boolean table[][] = new boolean[n+1][sum+1];
        for(int i=0 ; i<n+1 ; i++){
            for(int j=0 ; j<sum+1 ; j++){
                if(i == 0){
                    table[i][j] = false;
                }
                if(j == 0){
                    table[i][j] = true;
                }
            }
        }
        for(int i=1 ; i<n+1 ; i++){
            for(int j=1 ; j<sum+1 ; j++){
                if(a[i-1] <= j){
                    table[i][j] = table[i-1][j-a[i-1]] || table[i-1][j];
                }
                else{
                    table[i][j] = table[i-1][j];
                }
            }
        }
        if(table[n][sum] == true){
            return 1;
        }
        else{
            return 0;
        }
    }
}





















