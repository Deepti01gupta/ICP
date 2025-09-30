package DAY_4;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

//	https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
	public int lengthOfLongestSubstring(String s) {

        // tc : O(N) , sc : O(26)
        HashMap<Character, Integer> mp=new HashMap<>();
        int i=0;
        int j=0;
        int ans=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(mp.containsKey(ch)){
                i=Math.max(i,mp.get(ch)+1);
            }
            mp.put(ch,j);
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
