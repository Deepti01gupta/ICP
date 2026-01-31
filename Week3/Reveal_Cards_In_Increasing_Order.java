package Week3;

import java.util.*;

public class Reveal_Cards_In_Increasing_Order {

//	https://leetcode.com/problems/reveal-cards-in-increasing-order/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] ans=deckRevealedIncreasing(arr);
		for(int i:ans) {
			System.out.print(i+" ");
		}
		System.out.println();
		sc.close();
	}
	
	public static int[] deckRevealedIncreasing(int[] arr) {
		Deque<Integer> q=new ArrayDeque<>();
		Arrays.sort(arr);
		int n=arr.length;
		for(int i=n-1; i>=0; i--) {
			if(q.isEmpty()) {
				q.add(arr[i]);
			}
			else {
				int v=q.removeLast();
				q.addFirst(v);
				q.addFirst(arr[i]);
			}
		}
		
		int idx=0;
		int[] ans=new int[n];
		for(int i:q) {
			ans[idx++]=i;
		}
		
		return ans;
	}

}
