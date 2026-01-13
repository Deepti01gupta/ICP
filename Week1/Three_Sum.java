package Week1;

import java.util.*;

public class Three_Sum {

//	https://leetcode.com/problems/3sum/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		List<List<Integer>> ll=threeSum(arr);
		System.out.println(ll);
		sc.close();

	}
	
	public static List<List<Integer>> threeSum(int[] arr){
		List<List<Integer>> ll=new ArrayList<>();
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-2; i++) {
			
			if(i>0 && arr[i]==arr[i-1]) {
				continue;
			}
			
			int left=i+1;
			int right=arr.length-1;
			
			while(left<right) {
				int sum=arr[i]+arr[left]+arr[right];
				if(sum==0) {
					ll.add(Arrays.asList(arr[i],arr[left],arr[right]));
					
					while(left<right && arr[left]==arr[left+1]) {
						left++;
					}
					
					while(right>left && arr[right]==arr[right-1]) {
						right--;
					}
					
					left++;
					right--;
				}
				
				else if(sum<0) {
					left++;
				}
				else {
					right--;
				}
			}
		}
		return ll;
	}

}
