import java.util.*;

class Solution {
	public static void main (String[] args) {
        int n = 7;
		int a[] = {3, 5, 10, 15, 17, 12, 9};
		Arrays.sort(a);
		int k = 4;
		System.out.println(solve(a,n,k));
	}
	
	static int solve(int a[],int n,int k) {
		int dp[] = new int[n];
		dp[0] = 0;
		for(int i=1 ; i<n ; i++) {
			dp[i] = dp[i-1];
			if(a[i]-a[i-1] < k) {
				if(i >= 2) {
					dp[i] = Math.max(dp[i], a[i]+a[i-1]+dp[i-2]);
				}
				else {
					dp[i] = Math.max(dp[i], a[i]+a[i-1]);
				}
			}
		}
		return dp[n-1];
	}
}