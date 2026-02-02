package Week3;

import java.util.*;

public class Queue_on_Bus_Stop {
	
//	https://codeforces.com/problemset/problem/435/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans=fun(arr,m);
		System.out.println(ans);
		sc.close();

	}
	
	public static int fun(int[] arr, int m) {
		int c=0;
		
		Queue<Integer> q=new LinkedList<>();
		for(int i:arr) {
			q.add(i);
		}
		
		while(!q.isEmpty()) {
			int sum=0;
			while(!q.isEmpty() && sum+q.peek()<=m) {
				sum+=q.poll();
			}
			c++;
		}
		return c;
	}

}
