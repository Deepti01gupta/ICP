package Week1;

import java.util.*;

public class Third_Maximum_Number {
	
//	https://leetcode.com/problems/third-maximum-number/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        Arrays.sort(result);
        
        return result;
    }
    public int thirdMax(int[] nums) {
        int[] res=removeDuplicates(nums);  
        int n=res.length;
        if(n<3){
            return res[n-1];
        }
        else{
            return res[n-3];
        }
    }

}
