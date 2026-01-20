package Week2;
import java.util.*;

public class Next_Greater_Element_II {

//	https://leetcode.com/problems/next-greater-element-ii/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] ans=nextGreaterElements(arr);
		
		for(int i:ans) {
			System.out.print(i+" ");
		}
		System.out.println();
		sc.close();
	}
	
	
	public static int[] nextGreaterElements(int[] nums) {
		int n=nums.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        
        for(int i=0; i<2*n; i++) {
        	while(!st.isEmpty() && nums[st.peek()]<nums[i%n]) {
        		ans[st.pop()]=nums[i%n];
        	}
        	if(i<n) {
        		st.push(i);
        	}
        }
        
        while(!st.isEmpty()) {
        	ans[st.pop()]=-1;
        }
        
        return ans;
    }

}
