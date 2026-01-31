package Week3;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Jump_Game_VI {

//	https://leetcode.com/problems/jump-game-vi/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		
		int ans=maxResult(arr,k);
		System.out.println(ans);
		sc.close();
	}
	
	public static int maxResult(int[] arr, int k) {
		int n=arr.length;
		
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        pq.add(new int[] {0,arr[0]});
        
        int cur=arr[0];
        
        for(int i=1; i<n; i++) {
        	while(!pq.isEmpty() && pq.peek()[0]<i-k) {
        		pq.poll();
        	}
        	
        	cur=arr[i]+pq.peek()[1];
        	
        	pq.add(new int[] {i,cur});
        
        }
        
        return cur;
        
    }

}
