package Week1;

import java.util.*;

public class median_of_Two_Sorted_Arrays {

//	https://leetcode.com/problems/median-of-two-sorted-arrays/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int[] nums1=new int[n1];
		for(int i=0; i<n1; i++) {
			nums1[i]=sc.nextInt();
		}
		
		int n2=sc.nextInt();
		int[] nums2=new int[n2];
		for(int i=0; i<n2; i++) {
			nums2[i]=sc.nextInt();
		}
		
		double ans=findMedianSortedArrays(nums1, nums2);
		System.out.println(ans);
		sc.close();
		
	}
	
	public static double findMedianSortedArrays(int[] a, int[] b) {
        
        if(a.length>b.length){
            int[] t=a;
            a=b;
            b=t;
        }
        int lo=0;
        int hi=a.length;
        int total=(a.length+b.length);
        int hf=(total+1)/2;

        while(lo<=hi){
            int m1=(lo+hi)/2;
            int m2=hf-m1;

            int l1 = (m1==0)? Integer.MIN_VALUE: a[m1-1];
            int r1 = (m1==a.length)? Integer.MAX_VALUE: a[m1];
            int l2 = (m2==0)? Integer.MIN_VALUE: b[m2-1];
            int r2 = (m2==b.length)? Integer.MAX_VALUE: b[m2];


            if( l1<=r2 && l2<=r1){
                double ans;
                if(total%2==0){
                    ans=(Math.max(l2,l1) + Math.min(r1,r2))/2.0;
                }
                else{
                    ans=Math.max(l2,l1);
                }
                return ans;
            }
            else if(l2>r1){
                lo=m1+1;
            }
            else{
                hi=m1-1;
            }
        }
        return -1;
    }

}
