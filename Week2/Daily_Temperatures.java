package Week2;
import java.util.*;

public class Daily_Temperatures {

//	https://leetcode.com/problems/daily-temperatures/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans[]=dailyTemperatures(arr);
		
		for(int i:ans) {
			System.out.print(i+" ");
		}
		System.out.println();
		sc.close();
		
	}
	
	public static int[] dailyTemperatures(int[] arr) {
		int n=arr.length;
		Stack<Integer> st=new Stack<>();
		int[] ans=new int[n];
		
		for(int i=0; i<n; i++) {
			while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
				ans[st.peek()]=(i-st.pop());
			}
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			ans[st.pop()]=0;
		}
		
		return ans;
		
	}

}
