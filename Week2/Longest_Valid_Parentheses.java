package Week2;

import java.util.*;

public class Longest_Valid_Parentheses {

//	https://leetcode.com/problems/longest-valid-parentheses/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		int ans=longestValidParentheses(s);
		System.out.println(ans);
		sc.close();
	}
	
	public static int longestValidParentheses(String s) {
        int ans=0;
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i)=='(') {
        		st.push(i);
        	}
        	else {
        		st.pop();
        		if(st.isEmpty()) {
        			st.push(i);
        		}
        		else {
        			ans=Math.max(ans, i-st.peek());
        		}
        	}
        }
        return ans;
    }

}
