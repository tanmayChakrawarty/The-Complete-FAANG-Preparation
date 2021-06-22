import java.util.*;
class Solution{

	public static int productSubSeqCount(int a[], int k)
	{
		int n = a.length;
		int dp[][]=new int[k + 1][n + 1];
		
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= n; j++) {

				dp[i][j] = dp[i][j - 1];
		
				if (a[j-1] <= i && a[j-1] > 0)
					dp[i][j] += dp[ i / a[j - 1] ][j - 1] + 1;
			}
		}
		return dp[k][n];
	}
	public static void main(String args[])
	{
        int a[] = {1,2,3,4};
		int k = 10;
		System.out.println(productSubSeqCount(a, k));
	}
}