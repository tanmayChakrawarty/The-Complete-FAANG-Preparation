class Solution {

	static int n_P_r(int n, int r) {
		int dp[] = new int[n+1];
		dp[0] = 1;
		for(int i=1 ; i<n+1 ; i++) {
			dp[i] = i * dp[i-1];
		}
		return dp[n]/dp[n-r];
	}

	public static void main(String[] args) {
		int n = 10, r = 2;

        System.out.println(n_P_r(n,r));

	}
}