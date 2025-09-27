package DAY_1;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

<<<<<<< HEAD
//	https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
=======
  //	https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
>>>>>>> 98e5c0216d3eb32c198626948228ed99fe60d3ec
	public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int x1=first(nums,target);
        int x2=last(nums,target);
        ans[0]=x1;
        ans[1]=x2;
        return ans;
    }

    public int first(int[] arr, int t){
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==t){
                ans=mid;
                hi=mid-1;
            }
            else if(arr[mid]>t){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

    public int last(int[] arr, int t){
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==t){
                ans=mid;
                lo=mid+1;
            }
            else if(arr[mid]>t){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    
}
