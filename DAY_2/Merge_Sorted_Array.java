package DAY_2;

import java.util.*;

public class Merge_Sorted_Array {
	
	
//	https://leetcode.com/problems/merge-sorted-array/
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=nums1.length-1;
        int j=0;
        while(i>=m){
            nums1[i]=nums2[j];
            i--;
            j++;
        }
        Arrays.sort(nums1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
