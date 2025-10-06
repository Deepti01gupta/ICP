package DAY_8;

import java.util.*;

public class Evaluate_Reverse_Polish_Notation {

//	https://leetcode.com/problems/evaluate-reverse-polish-notation/
	public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(String s: tokens){
            if(is_operator(s)){
                int n1=Integer.parseInt(st.pop());
                int n2=Integer.parseInt(st.pop());
                int res=0;
                if(s.equals("+")){
                    res=n1+n2;
                }
                else if(s.equals("-")){
                    res=n2-n1;
                }
                else if(s.equals("*")){
                    res=n1*n2;
                }
                else if(s.equals("/")){
                    res=n2/n1;
                }
                st.push(Integer.toString(res));
            }
            else{
                st.push(s);
            }
        }
        return Integer.parseInt(st.peek());
    }

    private boolean is_operator(String s){
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
            return true;
        }
        return false;
    }
}
