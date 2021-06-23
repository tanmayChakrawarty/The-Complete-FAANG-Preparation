import java.util.*;

class Solution {
	public static void main (String[] args) {
		int r = 2;
        int c = 2;
        int m[][] = {{1, 1}, 
                     {1, 1}};
        System.out.println(solve(m,r,c));
	}
	
	static int solve(int m[][],int r,int c) {
		int s[][] = new int[r][c];
		for(int i=0 ; i<r ; i++) {
			s[i][0] = m[i][0];
		}
		for(int j=0 ; j<c ; j++) {
			s[0][j] = m[0][j];
		}
		for(int i=1 ; i<r ; i++) {
			for(int j=1 ; j<c ; j++) {
				if(m[i][j] == 1) {
					s[i][j] = Math.min(s[i][j-1], Math.min(s[i-1][j], s[i-1][j-1])) + 1;
				}
				else {
					s[i][j]=0;
				}
			}
		}
		int max = s[0][0];
		for(int i=0 ; i<r ; i++) {
			for(int j=0 ; j<c ; j++) {
				if(max < s[i][j]) {
					max=s[i][j];
				}
			}
		}
		return max;
	}
}