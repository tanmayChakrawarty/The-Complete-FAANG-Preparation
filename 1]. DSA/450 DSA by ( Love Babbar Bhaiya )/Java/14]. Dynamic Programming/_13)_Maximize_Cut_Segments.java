
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
	public static void main (String[] args) {
		int n = 4;
        int x = 2;
        int y = 1;
        int z = 1;
        System.out.println(maximizeCuts(n,x,y,z));
	}
	static int maximizeCuts(int n,int x,int y,int z){
	    int t[] = new int[n+1];
	    Arrays.fill(t,-1);
	    t[0]=0;
	    for(int i=0 ; i<n+1 ; i++){
	        if(t[i]==-1){
	            continue;
	        }
	        if(x+i <= n){
	            t[i+x] = Math.max(t[i+x],t[i]+1);
	        }
	        if(y+i <= n){
	            t[i+y] = Math.max(t[i+y],t[i]+1);
	        }
	        if(z+i <= n){
	            t[i+z] = Math.max(t[i+z],t[i]+1);
	        }
	    }
	    return t[n];
	}
}