package Week2;
import java.util.*;

public class Next_Greater_Element_I {

//	https://leetcode.com/problems/next-greater-element-i/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums1=new int[n];
		for(int i=0; i<n; i++) {
			nums1[i]=sc.nextInt();
		}
		
		int m=sc.nextInt();
		int[] nums2=new int[m];
		for(int i=0; i<m; i++) {
			nums2[i]=sc.nextInt();
		}
		
		int[] ans=nextGreaterElement(nums1, nums2);
		
		for(int i:ans) {
			System.out.print(i+" ");
		}
		System.out.println();
		sc.close();
		
	}
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums2.length];
        
        Map<Integer, Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<nums2.length; i++) {
        	map.put(nums2[i],i);
        	while(!st.isEmpty() && nums2[i]>st.peek()) {
        		int v=st.pop();
        		arr[v]=nums2[i];
        	}
        	st.push(i);
        }
        
        while(!st.isEmpty()) {
        	arr[st.pop()]=-1;
        }
        
        int[] ans=new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
        	ans[i]=arr[map.get(nums1[i])];
        }
        
        return ans;
        
    }

}
