package Week3;

import java.util.*;

public class Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I {

//	https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans=minOperations(arr);
		System.out.println(ans);
		sc.close();
	}
	
	public static int minOperations(int[] arr) {
		int c=0;
		int n=arr.length;
		for(int r=0; r<=n-3; r++) {
			if(arr[r]==1) {
				continue;
			}
			else {
				arr[r]=1-arr[r];
				arr[r+1]=1-arr[r+1];
				arr[r+2]=1-arr[r+2];
				c++;
			}
		}
		
		if(arr[n-1]==0 || arr[n-2]==0) {
			return -1;
		}
		return c;
	}

}
