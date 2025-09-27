package DAY_2;

import java.util.*;

public class Kth_Largest_Element_in_an_Array {
	
	
//	https://leetcode.com/problems/kth-largest-element-in-an-array/
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            return b-a;
        });
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        while(k>1){
            pq.poll();
            k--;
        }
        return pq.peek();

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
