package Week2;

import java.util.*;

public class Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans=trap(arr);
		
		System.out.println(ans);
		sc.close();
	}
	
	public static int trap(int[] height) {        
        return trapping(height);
    }
	
    public static int trapping(int[] arr) {
    	int n=arr.length;
    	Stack<Integer> st=new Stack<>();
    	int ans=0;
    	
    	for(int i=0; i<n; i++) {
    		while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
    			int top=st.pop();
    			
    			if(st.isEmpty()) {
    				break;
    			}
    			
    			int dis=i-st.peek()-1;
    			int height=Math.min(arr[i], arr[st.peek()])-arr[top];
    			ans+=dis*height;
    		}
    		st.push(i);
    	}
    	
    	return ans;
    }

}
