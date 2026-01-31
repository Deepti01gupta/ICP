package Week3;

import java.util.*;

public class Find_the_Winner_of_the_Circular_Game {

//	https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int ans=findTheWinner(n,k);
		System.out.println(ans);
		sc.close();

	}
	
	public static int findTheWinner(int n, int k) {
		Queue<Integer> q=new LinkedList<>();
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		int c=0;
		while(q.size()>1) {
			int v=q.poll();
			c++;
			if(c==k) {
				c=0;
				continue;
			}
			
			q.add(v);
		}
		
		return q.peek();
	}

}
