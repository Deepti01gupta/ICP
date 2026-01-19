package Week2;
import java.util.*;

public class Min_Stack {
	
//	https://leetcode.com/problems/min-stack/
	
	Stack<Integer> st;
	Stack<Integer> minst;
	
	public Min_Stack() {
        st=new Stack<>();
        minst=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty() || val<=minst.peek()) {
        	minst.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()) {
        	return;
        }
        
        int r=st.pop();
        if(r==minst.peek()) {
        	minst.pop();
        }
    }
    
    public int top() {
    	if(st.isEmpty()) {
    		return -1;
    	}
    	return st.peek();
    }
    
    public int getMin() {
        if(minst.isEmpty()) {
        	return -1;
        }
        return minst.peek();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Min_Stack obj = new Min_Stack();
		obj.push(5);
		obj.push(2);
		obj.push(3);
		obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
		
	}
	
	

} 
