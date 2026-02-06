package Week2;

import java.util.*;

public class Minimum_Operations_to_Make_the_Array_Alternating {

//	https://leetcode.com/problems/minimum-operations-to-make-the-array-alternating/
	
	public int minimumOperations(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> evenMap = new HashMap<>();
        Map<Integer, Integer> oddMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenMap.put(nums[i], evenMap.getOrDefault(nums[i], 0) + 1);
            } else {
                oddMap.put(nums[i], oddMap.getOrDefault(nums[i], 0) + 1);
            }
        }
        
        int[] evenTop = getTopTwo(evenMap);
        int[] oddTop = getTopTwo(oddMap);
        
        if (evenTop[0] != oddTop[0]) {
            return n - (evenTop[1] + oddTop[1]);
        }
        return n - Math.max(evenTop[1] + oddTop[2], evenTop[2] + oddTop[1]);
    }
    
    private int[] getTopTwo(Map<Integer, Integer> map) {
        int maxNum = 0, maxCount = 0;
        int secondCount = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int count = e.getValue();
            if (count > maxCount) {
                secondCount = maxCount;
                maxCount = count;
                maxNum = e.getKey();
            } else if (count > secondCount) {
                secondCount = count;
            }
        }
        return new int[]{maxNum, maxCount, secondCount};
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
