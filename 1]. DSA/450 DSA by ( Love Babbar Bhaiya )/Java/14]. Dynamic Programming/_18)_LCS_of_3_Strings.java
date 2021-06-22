import java.util.*;

class Solution {
	public static void main (String[] args) {
		String a = "geeks";
        String b = "geeksfor";
        String c = "geeksforgeeks";
        System.out.println(lcs3str(a,b,c));
	}
	static int lcs3str(String a,String b,String c) {
		int t[][][] = new int[a.length()+1][b.length()+1][c.length()+1];
		for(int i=0 ; i<a.length()+1 ; i++) {
			for(int j=0 ; j<b.length()+1 ; j++) {
				for(int k=0 ; k<c.length()+1 ; k++) {
					if(i==0 || j==0 || k==0) {
						t[i][j][k] = 0;
					}
					else if(a.charAt(i-1)==b.charAt(j-1) && a.charAt(i-1)==c.charAt(k-1)) {
						t[i][j][k] = 1 + t[i-1][j-1][k-1];
					}
					else {
						t[i][j][k] = Math.max(t[i-1][j][k], Math.max(t[i][j-1][k], t[i][j][k-1]));
					}
				}
			}
		}
		return t[a.length()][b.length()][c.length()];
	}
}