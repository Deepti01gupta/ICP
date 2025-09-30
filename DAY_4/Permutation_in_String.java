package DAY_4;

public class Permutation_in_String {

//	https://leetcode.com/problems/permutation-in-string/
	public boolean checkInclusion(String s1, String s2) {
        
        // tc : O(n) , sc : O(26)
        int[] fre1=new int[26];
        for(int i=0; i<s1.length(); i++){
            fre1[s1.charAt(i)-'a']++;
        }

        int k=s1.length();

        for(int i=0; i<s2.length(); i++){
            int j=0, idx=i;
            int fre2[]=new int[26];

            while(j<k && idx<s2.length()){
                fre2[s2.charAt(idx)-'a']++;
                j++;
                idx++;
            }

            if(isequal(fre1,fre2)){
                return true;
            }
        }
        return false;
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
