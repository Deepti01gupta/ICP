package Week2;

import java.util.*;

public class Valid_Parenthesis_String {
	
//	https://leetcode.com/problems/valid-parenthesis-string/description/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(checkValidString(s));
		sc.close();
	}
	
	public static boolean checkValidString(String s) {
		Stack<Integer> st=new Stack<>();
		Stack<Integer> star=new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				st.push(i);
			}
			
			else if(s.charAt(i)=='*') {
				st.push(i);
			}
			
			else {
				if(!st.isEmpty()) {
					st.pop();
				}
				else if(!star.isEmpty()) {
					star.pop();
				}
				else if(star.isEmpty() && st.isEmpty()) {
					return false;
				}
			}
		}
		
		while(!st.isEmpty() && !star.isEmpty()) {
			if(st.peek()>star.peek()) {
				return false;
			}
			st.pop();
			star.pop();
		}
		
		return st.isEmpty();
	}
	
	
//	public static boolean checkValidString(String s) {
//		int min=0;
//		int max=0;
//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i)=='(') {
//				min=min+1;
//				max=max+1;
//			}
//			else if(s.charAt(i)==')') {
//				min=min-1;
//				max=max+1;
//			}
//			else {
//				min=min-1;
//				max=max+1;
//			}
//			if(min<0) {
//				min=0;
//			}
//			if(max<0) {
//				return false;
//			}
//		}
//		return min==0;
//    }

}
