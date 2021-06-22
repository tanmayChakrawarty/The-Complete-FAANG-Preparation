import java.io.*;
import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        int n = 3;
        System.out.println(countFriendsPairings(n));
       
    }
    static long countFriendsPairings(int n) 
    { 
       long t[] = new long[n+1];
       int mod = (int)(Math.pow(10,9)+7);
       for(int i=0 ; i<n+1 ; i++){
           if(i <= 2){
               t[i] = i;
           }
           else{
               t[i] = (t[i-1] + (i-1)*t[i-2])%mod;
           }
       }
       return t[n];
    }
}   
 