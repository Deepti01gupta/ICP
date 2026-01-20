package Week2;
import java.util.*;

public class Decode_String {

//	https://leetcode.com/problems/decode-string/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String ans=decodeString(s);
		System.out.println(ans);
		sc.close();
	}
	
	public static String decodeString(String s) {
		
		Stack<Integer> num=new Stack<>();
		Stack<String> st=new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				int v=0;
				
				while(i<s.length() && Character.isDigit(s.charAt(i))) {
					v=v*10+(int)(s.charAt(i)-'0');
					i++;
				}
				i--;
				
				num.push(v);
			}
			
			else if(ch!=']') {
				st.push(ch+"");
			}
			else {
				String str="";
				while(!st.peek().equals("[")){
					str=st.pop()+str;
				}
				st.pop(); // for "[" 
				
				int v=num.pop();
                StringBuilder sb=new StringBuilder("");
				while(v>0) {
					sb.append(str);
					v--;
				}
				st.push(sb.toString());
			}	
		}
		
		StringBuilder ans=new StringBuilder("");
        while(st.size()>0){
            ans.insert(0,st.pop());
        }
        return ans.toString();
	}

}
