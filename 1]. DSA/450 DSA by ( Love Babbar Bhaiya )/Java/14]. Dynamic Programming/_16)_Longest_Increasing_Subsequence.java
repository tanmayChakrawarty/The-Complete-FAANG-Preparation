import java.util.*;

class Solution {
	public static void main (String[] args) {
		int N = 16;
        int A[] = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        System.out.println(LIS(A,N));
	}
	
	static int LIS(int a[],int n) {
		int dp[] = new int[n];
		Arrays.fill(dp, 1);
		for(int i=1 ; i<n ; i++) {
			for(int j=0 ; j<i ; j++) {
				if(a[i] > a[j] && dp[i] < dp[j]+1) {
					dp[i] = dp[j]+1;
				}
			}
		}
		int max = Arrays.stream(dp).max().getAsInt();
		return max;
	}
}