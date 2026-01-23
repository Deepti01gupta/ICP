package Week2;

import java.util.*;

public class Remove_K_Digits {
	
//	https://leetcode.com/problems/remove-k-digits/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		
		String ans=removeKdigits(s,k);
		System.out.println(ans);
		sc.close();
	}
	
	public static String removeKdigits(String num, int k) {
		Stack<Character> st=new Stack<>();
		
		for(char ch:num.toCharArray()) {
			while(!st.isEmpty() && k>0 && st.peek()>ch) {
				st.pop();
				k--;
			}
			st.push(ch);
		}
		
		while(!st.isEmpty() && k>0) {
			st.pop();
			k--;
		}
		
		StringBuilder sb=new StringBuilder();
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		
		sb.reverse();
		while(sb.length()>1 && sb.charAt(0)=='0') {
			sb.deleteCharAt(0);
		}
		
		return (sb.length()>0)? sb.toString():"0";
	}

}
