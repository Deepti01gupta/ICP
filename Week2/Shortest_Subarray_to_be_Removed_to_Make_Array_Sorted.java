package Week2;

public class Shortest_Subarray_to_be_Removed_to_Make_Array_Sorted {
	
//	https://leetcode.com/problems/shortest-subarray-to-be-removed-to-make-array-sorted/
	
	
	public int findLengthOfShortestSubarray(int[] arr) {
        int n=arr.length;

        int i=0;
        while(i<n-1 && arr[i]<=arr[i+1]){
            i++;
        }

        if(i==n-1){
            return 0;
        }

        int j=n-1;
        while(j>0 && arr[j]>=arr[j-1]){
            j--;
        }

        int ans=Math.min(n-i-1,j);
        int left=0, right=j;
        while(left<=i && right<n){
            if(arr[left]<=arr[right]){
                ans=Math.min(ans,right-left-1);
                left++;
            }
            else{
                right++;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
