package Week1;

import java.util.*;

public class sieve_of_Eratosthenes_Generate_Prime_Numbers {
	
//	https://leetcode.com/problems/count-primes/description/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		List<Integer> ll=fun(n);
		System.out.println(ll);
		System.out.println(ll.size()); 
		sc.close();

	}
	
	public static List<Integer> fun(int n){
		boolean[] arr=new boolean[n+1];
		Arrays.fill(arr, true);
		
		for(int i=2; i<=n; i++) {
			if(!arr[i]) {
				continue;
			}
			int j=2;
			while(i*j<=n) {
				arr[i*j]=false;
				j++;
			}
		}
		
		List<Integer> ll=new ArrayList<>();
		for(int i=2; i<=n; i++) {
			if(arr[i]) {
				ll.add(i);
			}
		}
		
		return ll;
	}

}
