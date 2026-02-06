package Week1;

public class Maximum_Subarray {
	
//	https://leetcode.com/problems/maximum-subarray/
	
	public int maxSubArray(int[] nums) {
        return Maximum_sum(nums);
        
    }
    public static int Maximum_sum(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			ans=Math.max(ans,  sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
