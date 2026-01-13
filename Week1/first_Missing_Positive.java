package Week1;

import java.util.*;

public class first_Missing_Positive {

//	https://leetcode.com/problems/first-missing-positive/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans=fun(arr);
		System.out.println(ans);
		sc.close();

	}
	
	private static int fun(int[] arr) {
		int n=arr.length;		
		boolean flag=false;
		
		for(int i=0; i<n; i++) {
			if(arr[i]==1) {
				flag=true;
			}
			if(arr[i]<1 || arr[i]>n) {
				arr[i]=1;
			}
		}
		
		if(flag!=true) {
			return 1;
		}
		
		for(int i=0; i<n; i++) {
			int idx=Math.abs(arr[i])-1;
			if(arr[idx]>0) {
				arr[idx]=-arr[idx];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i]>0) {
				return i+1;
			}
		}
		return arr.length+1;
		
	}

}
