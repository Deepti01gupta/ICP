package Week1;
import java.util.*;

public class Best_Time_To_Buy_And_Sell_Stock {
	
//	https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

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
		int ans=0;
		int buy=arr[0];
		for(int i=0; i<n; i++) {
			if(buy>arr[i]) {
				buy=arr[i];
			}
			ans=Math.max(ans, arr[i]-buy);
		}
		return ans;
	}

}
