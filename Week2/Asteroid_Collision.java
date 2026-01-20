package Week2;

import java.util.*;

public class Asteroid_Collision {
	
//	https://leetcode.com/problems/asteroid-collision/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans[]=asteroidCollision(arr);
		
		for(int i:ans) {
			System.out.print(i+" ");
		}
		System.out.println();
		sc.close();
	}
	
	public static int[] asteroidCollision(int[] arr) {
		Stack<Integer> st=new Stack<>();
		
		for(int i:arr) {
			boolean flag=false;
			
			while(!st.isEmpty() && i<0 && st.peek()>0) {
				if(st.peek()<-i) {
					st.pop();
					continue;
				}
				if(st.peek()==-i) {
					st.pop();
				}
				flag=true;
				break;
			}
			
			if(!flag) {
				st.push(i);
			}
		}
		
		
		int[] ans=new int[st.size()];
		for(int i=st.size()-1; i>=0; i--) {
			ans[i]=st.pop();
		}
		return ans;
	}

}
