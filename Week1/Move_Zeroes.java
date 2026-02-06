package Week1;

public class Move_Zeroes {
	
//	https://leetcode.com/problems/move-zeroes/
	
	public void moveZeroes(int[] nums) {

        int k=0;
        int j=nums.length-1;
        int[] ans=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                ans[j]=0;
                j--;
            }
            else{
                ans[k]=nums[i];
                k++;
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=ans[i];
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
