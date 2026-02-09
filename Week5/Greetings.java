package Week5;

import java.util.*;

public class Greetings {
	
//	https://codeforces.com/problemset/problem/1915/F
	
	public static class Fenwick{
		int n;
		int[] bit;
		
		Fenwick(int n){
			this.n=n;
			bit=new int[n+1];
		}
		
		void update(int i, int delta) {
			while(i<=n) {
				bit[i]+=delta;
				i += i & -i;
			}
		}
		
		int query(int i) {
			int sum=0;
			while(i>0) {
				sum+=bit[i];
				i-=i&-i;
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			long[][] arr=new long[n][2];
			for(int i=0; i<n; i++) {
				arr[i][0]=sc.nextLong();
				arr[i][1]=sc.nextLong();
			}
			
//			int ans=fun(arr,n);
//			int ans=fun2(arr,n);
			
			long ans=fun3(arr,n);
			System.out.println(ans);
		}
		sc.close();
	}
	
	public static long fun3(long[][] arr, int n) {
		
		Arrays.sort(arr,(a,b)->{
			if(a[0]!=b[0]) {
				return Long.compare(a[0], b[0]);
			}
			return Long.compare(b[1], a[1]);
		});
		
		long[] rval=new long[n];
		for(int i=0; i<n; i++) {
			rval[i]=arr[i][1];
		}
		
		Arrays.sort(rval);
		
		Map<Long, Integer> map=new HashMap<>();
		int idx=1;
		for(long x:rval) {
			if(!map.containsKey(x)) {
				map.put(x, idx++);
			}
		}
		
		Fenwick fw=new Fenwick(idx);
		long ans=0;
		int inserted=0;
		
		for(int i=0; i<n; i++) {
			int r=map.get(arr[i][1]);
			
			ans+=inserted-fw.query(r);
			
			fw.update(r,1);
			inserted++;
		}
		return ans;
	}
	
//	public static int fun2(int[][] arr, int n) {
//		int c=0;
////		Arrays.sort(arr,(a,b)->a[0]-b[0]);
//		
//		while(true) {
//			HashMap<Integer, Integer> map=new HashMap<>();
//			boolean allequal=true;
//			
//			for(int i=0; i<n; i++){
//				
//				if(arr[i][0]!=arr[i][1]){
//	                arr[i][0]++;
//	                allequal=false;
//	            }
//
//	            int v=arr[i][0];
//	            map.put(v,map.getOrDefault(v, 0)+1);
//
//	            if(map.get(v)>1){
//	                c++;
//	            }
//			}
//			if(allequal) {
//				break;
//			}
//		}
//		return c;
//	}
	
	
//	public static int fun(int[][] arr, int n) {
//		int c=0;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				if(i==j) continue;
//				if(arr[j][0]<arr[i][0] && arr[j][1]>arr[i][1]) {
//					c++;
//				}
//			}
//		}
//		
//		return c;
//	}

}
