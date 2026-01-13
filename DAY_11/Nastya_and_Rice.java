package DAY_11;

import java.util.Scanner;

public class Nastya_and_Rice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			if(fun(n,a,b,c,d)) {
				System.out.println("YES");
			} 
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
	
	public static boolean fun(int n, int a, int b, int c, int d) {
		int min=c-d;
		int max=c+d;
		int v1=n*(a-b);
		int v2=n*(a+b);
		if(v1>max || v2<min) {
			return false;
		}
		return true;
	}
}
