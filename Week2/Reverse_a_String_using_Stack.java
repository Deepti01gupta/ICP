package Week2;
import java.util.*;

public class Reverse_a_String_using_Stack {

//	https://www.geeksforgeeks.org/dsa/stack-set-3-reverse-string-using-stack/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(reverse(s));
		sc.close();
	}
	
	private static String reverse(String s) {
		Stack<Character> st=new Stack<>();
		for(int i=0; i<s.length(); i++) {
			st.push(s.charAt(i));
		}
		
		StringBuilder sb=new StringBuilder();
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		
		return sb.toString();
	}

}
