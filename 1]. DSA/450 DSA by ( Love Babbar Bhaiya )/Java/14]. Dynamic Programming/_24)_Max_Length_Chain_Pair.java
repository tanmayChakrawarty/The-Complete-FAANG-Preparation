import java.util.*;
import java.lang.*;

class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}

class Chainlength
{
    public static void main (String[] args) {
        int n = 5;
        Pair pr[] = new Pair[n];
        int arr[] = {5, 24 , 39 ,60 , 15 ,28 , 27 ,40 , 50 ,90};
        for(int i = 0, j = 0; i < 2*n-1 && j < n; i = i+2, j++)
        {
            pr[j] = new Pair(arr[i], arr[i+1]);
        }
        Solution sol = new Solution();
        System.out.println(sol.maxChainLength(pr, n));
    }
}
class Solution
{
    class CompareByFirst implements Comparator<Pair>
    {
        public int compare(Pair a, Pair b)
        {
            return a.x - b.x;
        }
    }
    int maxChainLength(Pair arr[], int n)
    {
        Arrays.sort(arr, new CompareByFirst());
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<i ; j++){
               if(arr[i].x > arr[j].y && dp[i] < dp[j]+1){
                   dp[i] = dp[j]+1;
               }
           }
       }
       int max = Arrays.stream(dp).max().getAsInt();
       return max;
    }
}