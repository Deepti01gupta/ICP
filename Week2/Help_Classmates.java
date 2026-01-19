package Week2;
import java.util.*;

public class Help_Classmates {

//	https://www.geeksforgeeks.org/problems/help-classmates--141631/1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] ans=solve(arr);
		for(int i:ans) {
			System.out.print(i+" ");
		}
		System.out.println();
		sc.close();
	}
	
	private static int[] solve(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int[] ans=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
				ans[st.pop()]=arr[i];
			}
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		
		return ans;
	}

}
