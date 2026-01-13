package DAY_11;

import java.util.Scanner;

public class Nastya_and_Door {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			int[] ans=fun(n,k,arr);
			System.out.println(ans[0]+" "+ans[1]);
		}
		sc.close();
	}
	
	public static int[] fun(int n, int k, int[] arr) {
		
		int[] pre=new int[n];
		for(int i=1; i<n-1; i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				pre[i]=1;
			}
		}
		int c=0;
		for(int i=1; i<k-1; i++) {
			if(pre[i]==1) c++;
		}
		int p=c;
		int l=0;
		
		for(int i=1; i+k-1<n; i++) {
			
			if(pre[i]==1) {
				c--;
			}
			if(pre[i+k-2]==1) {
				c++;
			}
			if(c>p) {
				p=c;
				l=i;
			}
		}
		return new int[] {p+1,l+1};
	}

}
