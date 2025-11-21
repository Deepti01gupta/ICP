package DAY_13;
import java.util.*;

public class Validate_Stack_Sequences {
	
//	https://leetcode.com/problems/validate-stack-sequences/
	public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int j=0;
        for(int i=0; i<pushed.length; i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && j<popped.length && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        if(j==popped.length){
            return true;
        }
        return false;
    }
}
