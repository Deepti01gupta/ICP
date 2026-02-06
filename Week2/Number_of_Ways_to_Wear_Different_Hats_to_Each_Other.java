package Week2;

import java.util.*;

public class Number_of_Ways_to_Wear_Different_Hats_to_Each_Other {

//	https://leetcode.com/problems/number-of-ways-to-wear-different-hats-to-each-other/
	
	static final int mod=1_000_000_007;

    public int numberWays(List<List<Integer>> hats) {
 
        // hat k according people ko add kr rhe h
        // ki ith hate kisko pasand hai
        List<Integer>[] ll=new ArrayList[41]; 
        for(int i=1; i<=40; i++){
            ll[i]=new ArrayList<>();
        }

        int n=hats.size();

        for(int p=0; p<n; p++){
            for(int h:hats.get(p)){
                ll[h].add(p);
            }
        }

        // dp bana rhe h 
        int total=1<<n;
        long[] dp=new long[total];
        dp[0]=1;

        // dp fill kr rhe hai 
        for(int h=1; h<=40; h++){
            long[] cur=new long[total];

            for(int mask=0; mask<total; mask++){
                if(dp[mask]==0){
                    continue;
                }

                cur[mask]=(cur[mask]+dp[mask])%mod;

                for(int p:ll[h]){
                    if((mask & (1<<p))==0){
                        int newmask=mask | (1<<p);
                        cur[newmask]=(cur[newmask] + dp[mask])%mod;
                    }
                }
            }
            dp=cur;
        }
        return (int)(dp[(1<<n)-1]);
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
