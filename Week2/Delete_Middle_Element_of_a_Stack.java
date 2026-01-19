package Week2;
import java.util.*;

public class Delete_Middle_Element_of_a_Stack {

//	https://www.geeksforgeeks.org/dsa/delete-middle-element-stack/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Stack<Integer> st=new Stack<>();
		int i=0;
		while(i<n) {
			st.push(sc.nextInt());
			i++;
		}
		
		delete(st,n);
		
		while(!st.isEmpty()) {
			System.out.print(st.pop()+" ");
		}
		
		sc.close();
	}
	
	private static void delete(Stack<Integer> st, int n) {
		ArrayList<Integer> v=new ArrayList<>();
		while(!st.isEmpty()) {
			v.add(st.pop());
		}
		
		int mid=n/2;
		
		v.remove(mid);
		
		for(int i=v.size()-1; i>=0; i--) {
			st.push(v.get(i));
		}
	}

}
