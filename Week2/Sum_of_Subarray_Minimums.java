package Week2;

import java.util.*;

public class Sum_of_Subarray_Minimums {

//	https://leetcode.com/problems/sum-of-subarray-minimums/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans=sumSubarrayMins(arr);
		
		System.out.println(ans);
		sc.close();
	}
	
	public static int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int mod=1_000_000_007;
        
        int[] left=new int[n];    
        Stack<Integer> st=new Stack<>();
    
        for(int i=0; i<n; i++) {
        	while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
        		st.pop();
        	}
        	left[i]=st.isEmpty()? -1:st.peek();
        	st.push(i);
        }
        
        int[] right=new int[n];
        st.clear();
        
        for(int i=n-1; i>=0; i--) {
        	while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
        		st.pop();
        	}
        	right[i]=st.isEmpty()? n:st.peek();
        	st.push(i);
        }
        
        long ans=0;
        
        for(int i=0; i<n; i++) {
        	int l=i-left[i];
        	int r=right[i]-i;
        	long count=(long)arr[i]*l*r;
        	ans=(ans+count)%mod;
        }
        
        return (int)ans;
        
        
    }

}
