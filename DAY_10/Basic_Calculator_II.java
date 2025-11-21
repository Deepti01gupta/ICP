package DAY_10;
import java.util.*;

public class Basic_Calculator_II {

//	https://leetcode.com/problems/basic-calculator-ii/
	public int calculate(String s) {
        if(s.length()==0){
            return 0;
        }
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        int curr=0;
        char op='+';
        char[] ch=s.toCharArray();

        for(int i=0; i<n; i++){
            
            if(Character.isDigit(ch[i])){
                curr = curr*10 + (ch[i]-'0');
            }
            if(!Character.isDigit(ch[i]) && ch[i] != ' ' || i==ch.length-1 ){
                if(op=='+'){
                    st.push( curr );
                }
                else if(op=='-'){
                    st.push( -curr );
                }
                else if(op=='*'){
                    st.push( st.pop() * curr );
                }
                else if(op=='/'){
                    st.push( st.pop() / curr );
                }
                op=ch[i];
                curr=0;
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
	
}
