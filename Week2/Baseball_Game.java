package Week2;
import java.util.*;

public class Baseball_Game {

//	https://leetcode.com/problems/baseball-game/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		
		int ans=calPoints(arr);
		System.out.println(ans);
		sc.close();
	}
	
	public static int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        
        for(int i=0; i<operations.length; i++) {
        	if((operations[i].equals("C"))) {
        		st.pop();
        	}
        	else if(operations[i].equals("D")){
        		int v=st.peek();
        		st.push(2*v);
        	}
        	else if(operations[i].equals("+")) {
        		int a=st.pop();
        		int b=st.pop();
        		st.push(b);
        		st.push(a);
        		st.push(a+b);
        	}
        	else {
        		st.push(Integer.parseInt(operations[i]));
        	}
        }
        
        int sum=0;
        while(!st.isEmpty()) {
        	sum+=st.pop();
        }
        
        return sum;
    }

}
