import java.util.*;

class Solution {
	public static void main (String[] args) {
        int egg = 2;
        int floor = 10;
        int t[][] = new int[egg+1][floor+1];
        for(int i=0 ; i<egg+1 ; i++) {
            for(int j=0 ; j<floor+1; j++) {
                t[i][j] = -1;
            }
        }
        System.out.println(egg,floor,t);
	}
    static int solve(int egg,int floor,int t[][]) {
        if(floor==1 || floor==0) {
            return floor;
        }
        if(egg==1) {
            return floor;
        }
        if(t[egg][floor] != -1) {
            return t[egg][floor];
        }
        int min = Integer.MAX_VALUE;
        for(int k=1 ; k<=floor ; k++) {
            int temp = 1 + Math.max(solve(egg-1,k-1,t), solve(egg,floor-k,t));
            min = Math.min(min,temp);
        }
        t[egg][floor] = min;
        return t[egg][floor];
    }
}