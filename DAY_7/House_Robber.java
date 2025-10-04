package DAY_7;

import java.util.*;

public class House_Robber {

//	https://leetcode.com/problems/house-robber/
	public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        // return Robber(nums,0,dp);
        // return Robber2(nums,nums.length-1,dp);
        return RobberBU(nums);
    }

    public static int RobberBU(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2; i<dp.length; i++){
            int rob=arr[i]+dp[i-2];
            int dont_rob=dp[i-1];
            dp[i]=Math.max(rob,dont_rob);
        }
        return dp[dp.length-1];
        
    }
    
}
