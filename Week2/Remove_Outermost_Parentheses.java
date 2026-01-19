package Week2;
import java.util.*;

public class Remove_Outermost_Parentheses {

//	https://leetcode.com/problems/remove-outermost-parentheses/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(removeOuterParentheses(s));
		sc.close();

	}
	
	public static String removeOuterParentheses(String s) {
		StringBuilder sb=new StringBuilder();
		int open=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				if(open>0) {
					sb.append('(');
				}
				open++;
			}
			else {
				open--;
				if(open>0) {
					sb.append(')');
				}
			}
		}
		
		return sb.toString();
	}

}
