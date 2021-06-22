import java.util.*;
class Solution
{
    public static void main(String args[])
    {
       int N = 5;
       inr a[] = {1, 101, 2, 3, 100};
        System.out.println(maxSum(a,n));
    }
    static int maxSum(int a[], int n)  
	{
	    int dp[] = new int[n];
		for(int i=0 ; i<n ; i++) {
			dp[i] = a[i];
		}
		for(int i=1 ; i<n ; i++) {
			for(int j=0 ; j<i ; j++) {
				if(a[i] > a[j] && dp[i] < dp[j] + a[i]) {
					dp[i] = dp[j] + a[i];
				}
			}
		}
		int sum = Arrays.stream(dp).max().getAsInt();
		return sum;
	} 
}