package Week2;

import java.util.*;

public class Largest_Rectangle_in_Histogram {
	
//	https://leetcode.com/problems/largest-rectangle-in-histogram/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans=largestRectangleArea(arr);
		
		System.out.println(ans);
		sc.close();

	}
	
	public static int largestRectangleArea(int[] heights) {
        return largest_histogram(heights);
    }
	
	
	// prev smaller store ho rha h stack m element k neeche or jaise
	// hi nect smaller milta h turant ham area calculate kr lenge 
	public static int largest_histogram(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int ans=0;
		
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h=arr[st.pop()];
				int r=i;
				if(st.isEmpty()) {
					ans=Math.max(ans, h*r);
				}
				else {
					int l=st.peek();
					ans=Math.max(ans, h*(r-l-1));
				}
			}
			st.push(i);
		}
		
		int r=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				ans=Math.max(ans, h*r);
			}
			else {
				int l=st.peek();
				ans=Math.max(ans, h*(r-l-1));
			}
		}
		
		return ans;
	}

}
