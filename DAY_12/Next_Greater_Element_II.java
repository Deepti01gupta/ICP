package DAY_12;
import java.util.*;

public class Next_Greater_Element_II {

//	https://leetcode.com/problems/next-greater-element-ii/
	public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        int n=nums.length;
        Arrays.fill(ans,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<2*nums.length; i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i%n]){
                ans[st.pop()]=nums[i%n];
            }
            if(i<n){
                st.push(i);
            }
        }
        return ans;
    }
}
