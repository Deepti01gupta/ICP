package Week2;

import java.util.*;

public class Implementation_of_stack_using_arraylist {
	
	ArrayList<Integer> ll;
	int n=10;
	int size=0;
	
	public Implementation_of_stack_using_arraylist() {
        ll = new ArrayList<>();
    }
	
	public void push(int v) {
		if(size==n) {
			System.out.println("overflow");
			return;
		}
		ll.add(v);
		size++;
	}
	
	public int pop() {
		if(ll.size()==0) {
			System.out.println("underflow");
			return -1;
		}
		int v=ll.get(size-1);
		ll.remove(size-1);
		size--;
		return v;
	}
	
	public int peek() {
		if(ll.size()==0) {
			return -1;
		}
		int v=ll.get(size-1);
		return v;
	}
	
	public boolean isEmpty() { 
		if(size==0) {
			return true;
		}
		return false;
	}
}