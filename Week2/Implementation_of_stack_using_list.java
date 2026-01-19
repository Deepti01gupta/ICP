package Week2;

public class Implementation_of_stack_using_list {
	
	private int[] arr;
	private int idx=-1;
	
	public Implementation_of_stack_using_list() {
		arr=new int[5];
	}
	
	public Implementation_of_stack_using_list(int n) {
		arr=new int[n];
	}
	
	public int size() {
		return idx+1;
	}
	
	public void  push(int v) {
		if(isFull()) {
			System.out.println("overflow");
			return;
		}
		idx++;
		arr[idx]=v;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("underflow");
			return -1;
		}
		int v=arr[idx];
		idx--;
		return v;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		int v=arr[idx];
		return v;
	}
	
	public boolean isFull() {
		return idx==arr.length-1;
	}
	
	public boolean isEmpty() {
		return idx==-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
