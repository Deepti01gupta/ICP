package DAY_10;
import java.util.*;

public class Next_Greater_Element_I {

//	https://leetcode.com/problems/next-greater-element-i/
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Arrays.fill(ans,-1);
        // Stack<Integer> st=new Stack<>();
        for(int i=0; i<nums1.length; i++){
            // int idx=0;
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1; k<nums2.length; k++){
                        if(nums2[k]>nums2[j]){
                            ans[i]=nums2[k];
                            break;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
