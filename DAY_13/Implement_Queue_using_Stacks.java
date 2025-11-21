package DAY_13;
import java.util.*;

public class Implement_Queue_using_Stacks {
//	MyQueue obj = new MyQueue();
//	obj.push(x);
//	int param_2 = obj.pop();
//	int param_3 = obj.peek();
//	boolean param_4 = obj.empty();
	
	private Stack<Integer> main;
    private Stack<Integer> helper;
	
    public void MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        // main to helper krne k liye
        while(main.size()>0){
            helper.push(main.pop());
        }

        // add x to main
        main.push(x);

        // helper to main krne k liye
        while(helper.size()>0){
            main.push(helper.pop());
        }
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
        return main.peek();
    }
    
    public boolean empty() {
        if(main.size()==0){
            return true;
        }
        return false;
    }
}
