import java.io.*;
import java.util.*;
class Solution
{
    long countWays(int n,int k)
    {
        long t[] = new long[n+1];
        Arrays.fill(t,0);
        long mod =(long) (Math.pow(10,9)+7);
        t[1]=k;
        long same = 0,diff=k;
        for(int i=2 ; i<n+1 ; i++){
            same = diff;
            diff =(long)(t[i-1]*(k-1));
            diff=diff%mod;
            t[i] = (same + diff) % mod;
        }
        return t[n];
    }
    public static void main (String[] args){
            int n = 3;
            int k = 2;
            System.out.println(countWays(n,k));
        }
    }
}