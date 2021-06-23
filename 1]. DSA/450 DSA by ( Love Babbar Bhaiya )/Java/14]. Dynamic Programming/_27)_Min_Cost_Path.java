import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        int n = 2;
        int m[][] = {{348, 391},
                     {618, 193}};

        System.out.println(maximumPath(n,m));
    }
    static int maximumPath(int n, int a[][])
    {
        int dp[][] = new int[n][n+2];
		for(int rows[] : dp) {
			Arrays.fill(rows, 0);
		}
		for(int i=0 ; i<n ; i++) {
			dp[0][i+1] = a[0][i];
		}
		for(int i=1 ; i<n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i-1][j+1])) + a[i][j-1];
			}
		}
		int max=0;
		for(int i=0 ; i<=n ; i++) {
			max=Math.max(max,dp[n-1][i]);
		}
		return max;
    }
}