package Week2;

import java.util.*;

public class Find_the_Number_of_Subarrays_Where_Boundary_Elements_Are_Maximum {

//	https://leetcode.com/problems/find-the-number-of-subarrays-where-boundary-elements-are-maximum/
	
	public long numberOfSubarrays(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> freq = new HashMap<>();
        long ans = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                int idx = stack.pop();
                freq.put(nums[idx], freq.get(nums[idx]) - 1);
            }

            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            ans += freq.get(nums[i]);
            stack.push(i);
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
