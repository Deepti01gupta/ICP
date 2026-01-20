package Week2;
import java.util.*;

public class Stock_Span_Problem {

//	https://www.geeksforgeeks.org/dsa/the-stock-span-problem/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans[]=stock_span(arr);
		
		for(int i:ans) {
			System.out.print(i+" ");
		}
		System.out.println();
		sc.close();

	}
	
	public static int[] stock_span(int[] arr) {
		int n=arr.length;
		int[] ans=new int[n];
		
		Stack<Integer> st=new Stack<>();
		st.push(-1);
		
		for(int i=0; i<n; i++) {
			while(st.peek()!=-1 && arr[st.peek()]<arr[i]) {
				st.pop();
			}
			ans[i]=(i-st.peek());
			st.push(i);
		}
		
		return ans;
	}

}
