package Week1;

import java.util.*;

public class Find_the_index_of_first_occurance_in_a_string {
	
//	https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String haystack=sc.next();
		String needle=sc.next();
		
//		int idx=haystack.indexOf(needle);
		int idx=fun(haystack,needle);
		System.out.println(idx);
		sc.close();

	}
	
	public static int fun(String haystack, String needle) {
		if(needle.length()==0) {
			return 0;
		}
		
		for(int i=0; i<=haystack.length()-needle.length(); i++) {
			if(haystack.substring(i, i+needle.length()).equals(needle)){
				return i;
			}
		}
		return -1;
	}

}
