package DAY_1;

import java.util.*;

public class Sliding_Window_Maximum {

//	https://leetcode.com/problems/sliding-window-maximum/
	public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        if(n==0 || k==0){
            return new int[0];
        }
        int[] ans=new int[n-k+1];
        Deque<Integer> deque=new ArrayDeque<>();
        for(int i=0; i<n; i++){
            // check krenge ki dequeue empty to nahi h or 
            // koi bhi peeche ki value to nahi h jo window m nahi aa skti h 
            // usko bahar kr denge
            if(!deque.isEmpty() && deque.peek()<i-k+1){
                deque.poll();
            }
            
            // or ham dec. queue maintain kr rhe hai to 
            // peeche side mai jitne bhi smaller element honge dequeue main unko bahr kr denge
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }

            // end main ham apni idx ko store kr denge further iteration help k liye
            deque.offer(i);

            // isme kam k-1 se store krna start krenge 
            // kyuki 0 to k-2 tk to hamara window size hi pura nahi hua hoga 
            // to ans m kaise store kr skte hai
            if(i>=k-1){
                ans[i-k+1]=nums[deque.peek()];
            }
        }
        return ans;
    }

}
