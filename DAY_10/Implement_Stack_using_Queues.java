package DAY_10;
import java.util.*;

//https://leetcode.com/problems/implement-stack-using-queues/
public class Implement_Stack_using_Queues {

//	MyStack obj = new MyStack();
//	obj.push(x);
//	int param_2 = obj.pop();
//	int param_3 = obj.top();
//	boolean param_4 = obj.empty();
	 
	 
	private Queue<Integer> main;
    private Queue<Integer> helper;

    public void MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    public void push(int x) {
        // moving form main to helper
        while(main.size()>0){
            helper.add(main.remove());
        }
        // add x to main
        main.add(x);
        // moving from helper to main
        while(helper.size()>0){
            main.add(helper.remove());
        }
    }
    
    public int pop() {
        return main.remove();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {
        if(main.size()==0){
            return true;
        }
        return false;
    }
    
}
