package Week1;

import java.util.*;

public class Two_Sum {
	
//	https://leetcode.com/problems/two-sum/
	
	public int[] twoSum(int[] nums, int target) {
        return sum(nums,target);
        
    }
    public int[] sum(int[] arr, int t){
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int x=t-arr[i];
            if(mp.containsKey(x)){
                return new int[]{mp.get(x),i};
            }
            else{
                mp.put(arr[i],i);
            }
        }
        return new int[]{0,0};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
