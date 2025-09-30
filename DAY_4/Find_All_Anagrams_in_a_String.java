package DAY_4;

import java.util.*;

public class Find_All_Anagrams_in_a_String {

//	https://leetcode.com/problems/find-all-anagrams-in-a-string/
	public List<Integer> findAnagrams(String s, String p) {

        // tc O(N) , sc : O(26)
        List<Integer> ll=new ArrayList<>();
        int[] fre1=new int[26];
        for(int i=0; i<p.length(); i++){
            fre1[p.charAt(i)-'a']++;
        }

        int k=p.length();
        int fre2[]=new int[26];
        for(int i=0; i<s.length(); i++){
            fre2[s.charAt(i)-'a']++;
            if(i>=k){
                fre2[s.charAt(i-k)-'a']--;
            }

            if(isequal(fre1,fre2)){
                ll.add(i-k+1);
            }
        }
        return ll;
    }

    public boolean isequal(int[] fre1, int[] fre2){
        for(int i=0; i<26; i++){
            if(fre1[i]!=fre2[i]){
                return false;
            }
        }
        return true;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
