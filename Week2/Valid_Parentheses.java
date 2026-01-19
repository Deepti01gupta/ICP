package Week2;

import java.util.*;

public class Valid_Parentheses {

//	https://leetcode.com/problems/valid-parentheses/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(isValid(s));
		sc.close();

	}
	
	public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
        	char ch=s.charAt(i);
        	if(ch=='(' || ch=='{' || ch=='[') {
        		st.push(ch);
        	}
        	else if(!st.isEmpty() && ch==')') {
        		if(st.peek()!='(') {
        			return false;
        		}
        		else {
        			st.pop();
        		}
        	}
        	else if(!st.isEmpty() && ch=='}') {
        		if(st.peek()!='{') {
        			return false;
        		}
        		else {
        			st.pop();
        		}
        	}
        	else if(!st.isEmpty() && ch==']') {
        		if(st.peek()!='[') {
        			return false;
        		}
        		else {
        			st.pop();
        		}
        	}
        }
        if(st.size()!=0) {
        	return false;
        }
        return true;
    }

}
