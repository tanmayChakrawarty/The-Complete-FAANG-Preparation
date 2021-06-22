import java.util.*;

class Solution {
	public static void main (String[] args) {
		String a = "abcde";
        String b = "ace";
        System.out.println(LCS(a,b));
	}
	static int LCS(String a, String b) {
        
        int dp[][] = new int[a.length()+1][b.length()+1];
        
        for(int i=0 ; i<a.length()+1 ; i++){
            for(int j=0 ; j<b.length()+1 ; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i=1 ; i<a.length()+1 ; i++){
            for(int j=1 ; j<b.length()+1 ; j++){
                
                if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        
        return dp[a.length()][b.length()];
    }
}