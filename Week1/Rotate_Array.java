package Week1;

public class Rotate_Array {
	
//	https://leetcode.com/problems/rotate-array/
	
	public void rotate(int[] nums, int k) {
        // int n=nums.length;
        rotate_array(nums,k);
    }
    // public void rotate_array(int[] arr, int k) {
    //     int n=arr.length;
    //     k=k%n;
    //     while(k>0){
    //         int item=arr[n-1];
    //         for(int i=n-2; i>=0; i--){
    //             arr[i+1]=arr[i];
    //         }
    //         arr[0]=item;
    //         k--;
    //     }
    // }
    public static void rotate_array(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        //starting n-k reverse kro
        reverse(arr,0,n-k-1);
        
//        last ke k reverse kro
        reverse(arr,n-k,n-1);
        
//        all element reverse kro
        reverse(arr,0,n-1);
        
    }
	
	public static void reverse(int arr[],int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
