import java.util.*;

class Solution {
	public static void main (String[] args) {
		String a = "abcde";
        String b = "ace";
        System.out.println(LCS(a,b));
	}
	
	static int LCS(String a, String b) {
        
        int m = a.length(),n = b.length();
		int t[][] = new int[2][n+1];
		int bit = 0;
		for(int i=0 ; i<m+1 ; i++) {
			bit = i & 1;
			for(int j=0 ; j<n+1 ; j++) {
				if(i==0 || j==0) {
					t[bit][j] = 0;
				}
				else if(a.charAt(i-1) == b.charAt(j-1)) {
					t[bit][j] = 1 + t[1-bit][j-1];
				}
				else {
					t[bit][j] = Math.max(t[1-bit][j], t[bit][j-1]);
				}
			}
		}
		return t[bit][n];
    }
}