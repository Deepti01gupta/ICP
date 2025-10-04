package DAY_7;

public class Maximum_Subarray {

//	https://leetcode.com/problems/maximum-subarray/
	public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        // for(int i=0; i<nums.length; i++){
        //     int sum=0;
        //     for(int j=i; j<nums.length; j++){
        //         sum+=nums[j];
        //         ans=Math.max(ans,sum);   
        //     }
        // }
        return ans;
    }
	
}
