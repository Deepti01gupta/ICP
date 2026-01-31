package Week3;

import java.util.*;

public class Time_Needed_to_Buy_Tickets {

//	https://leetcode.com/problems/time-needed-to-buy-tickets/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		
		int ans=timeRequiredToBuy(arr,k);
		System.out.println(ans);
		sc.close();
	}
	
	public static int timeRequiredToBuy(int[] arr, int k) {
		Queue<Integer> q=new LinkedList<>();
		for(int i=0; i<arr.length; i++) {
			q.add(i);
		}
		
		int c=0;
		while(!q.isEmpty()) {
			int idx=q.poll();
			c++;
			arr[idx]--;
			if(arr[idx]==0 && idx==k) {
				return c;
			}
			if(arr[idx]!=0) {
				q.add(idx);
			}
		}
		
		return c;
	}

}
