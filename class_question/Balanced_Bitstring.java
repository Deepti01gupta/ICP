package class_question;

import java.util.Scanner;

public class Balanced_Bitstring {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			String s=sc.next();
			if(check(n,k,s)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
	
	public static boolean check(int n, int k, String s) {
		char[] arr=s.toCharArray();
		for(int i=k; i<n; i++) {
			if(arr[i]=='1') {
				if(arr[i%k]=='0') {
					return false;
				}
				arr[i%k]='1';
			}
			else if(arr[i]=='0') {
				if(arr[i%k]=='1') {
					return false;
				}
				arr[i%k]='0';
			}
		}
		
		int c0=0;
		int c1=0;
		for(int i=0; i<k; i++) {
			if(arr[i]=='0') {
				c0++;
			}
			else if(arr[i]=='1') {
				c1++;
			}
		}
		if(c0>k/2 || c1>k/2) {
			return false;
		}
		else {
			return true;
		}
	}
}
