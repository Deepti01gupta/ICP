package DAY_11;

import java.util.Scanner;

public class Recursive_Queries {

	
	// tle aa rha h 
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int k=sc.nextInt();
			int ans=fun(l,r,k);
			System.out.println(ans);
		}
		sc.close();
	}
	
	public static int fun(int l, int r, int k) {
		int c=0;
		for(int i=l; i<=r; i++) {
			if(gfunc(i)==k) {
				c++;
			}
		}
		return c;
	}
	static int f(int x) {
        int p = 1;
        while (x > 0) {
            int d = x % 10;
            if (d != 0) p *= d;
            x /= 10;
        }
        return p;
    }

    static int gfunc(int x) {
        while (x >= 10) x = f(x);
        return x;
    }

}
