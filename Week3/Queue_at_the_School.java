package Week3;

import java.util.*;

public class Queue_at_the_School {
	
//	https://codeforces.com/problemset/problem/266/B

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();
		
		String ans=fun(n,s,k);
		System.out.println(ans);
		sc.close();
	}
	
	public static String fun(int n,String s, int k) {
		Queue<Character> q=new LinkedList<>();
		for(char c:s.toCharArray()) {
			q.add(c);
		}
		
		for(int sec=0; sec<k; sec++) {
			Queue<Character> next=new LinkedList<>();
			
			while(!q.isEmpty()) {
				char first=q.poll();
				
				if(!q.isEmpty() && first=='B' && q.peek()=='G') {
					char second=q.poll();
					next.add(second);
					next.add(first);
				}
				else {
					next.add(first);
				}
			}
			q=next;
		}
		
		StringBuilder ans=new StringBuilder();
		for(char c:q) {
			ans.append(c);
		}
		
		return ans.toString();
	}

}
