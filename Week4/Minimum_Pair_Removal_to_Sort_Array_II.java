package Week4;

import java.util.Scanner;

public class Minimum_Pair_Removal_to_Sort_Array_II {
	
//	https://leetcode.com/problems/minimum-pair-removal-to-sort-array-ii/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans=minimumPairRemoval(arr);
		System.out.println(ans);
		sc.close();
	}
	
	public static int minimumPairRemoval(int[] nums) {
		return 0;
	}
	
}
