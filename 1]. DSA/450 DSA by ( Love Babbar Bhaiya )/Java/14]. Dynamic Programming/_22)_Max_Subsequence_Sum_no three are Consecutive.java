import java.util.ArrayList;
import java.util.Arrays;

public class Solution{
    static int maxSumHandler(int a[], int i, int dp[]) {
        if (i <= 0) {
            return a[0];
        }

        if (i == 1) {
            return a[0] + a[1];
        }

        if (i == 2) {
            return Math.max(a[0] + a[1], Math.max(a[1] + a[2], a[0] + a[2]));
        }

        if(dp[i] != -1)
        {
            return dp[i];
        }
		int x = maxSumHandler(a, i - 2, dp);
        int y = maxSumHandler(a, i - 3, dp);
        int res =  Math.max(maxSumHandler(a, i - 1, dp), Math.max(a[i] + x , a[i] + a[i-1] + y));

        return dp[i] = res;
    }
    static int maxSum(int a[], int n){
		int dp[] = new int[n];
        Arrays.fill(dp, -1);
		return maxSumHandler(a, n - 1, dp);
	}
    public static void main(String args[])
    {
        int n = 8;
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(maxSum(a,n));
    }
}