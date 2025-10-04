package DAY_2;

//import java.util.*;

public class Merge_Sorted_Array {
	
	
//	https://leetcode.com/problems/merge-sorted-array/
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int[] arr=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=nums2[j];
            j++;
            k++;
        }

        for(i=0; i<m+n; i++){
            nums1[i]=arr[i];
        }

		
        // int i=nums1.length-1;
        // int j=0;
        // while(i>=m){
        //     nums1[i]=nums2[j];
        //     i--;
        //     j++;
        // }
        // Arrays.sort(nums1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
