package Week1;

import java.util.*;

public class Remove_Duplicates_from_Sorted_Array {
	
//	https://leetcode.com/problems/remove-duplicates-from-sorted-array/

	
	public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int k=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
