package Week3;

import java.util.*;

public class Queue_ {
	
//	https://codeforces.com/problemset/problem/353/D

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		long count=0;
		long time=0;
		
		for(char ch:s.toCharArray()) {
			if(ch=='M') {
				count++;
			}
			else if(count>0) {
				time=Math.max(time+1, count);
			}
		}
		System.out.println(time);
		sc.close();
	}

}
