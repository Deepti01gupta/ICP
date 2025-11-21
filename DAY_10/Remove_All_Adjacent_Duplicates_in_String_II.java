package DAY_10;
import java.util.*;

public class Remove_All_Adjacent_Duplicates_in_String_II {

//	https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
	public String removeDuplicates(String s, int k) {
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char curr=s.charAt(i);
            int size=sb.length();
            if(size>0 && curr==sb.charAt(size-1)){
                int count=st.pop();
                if(count+1<k){
                    st.push(count+1);
                    sb.append(curr);
                }
                else{
                    sb.setLength(size-(k-1));
                }
            }
            else{
                sb.append(curr);
                st.push(1);
            }
        }
        return sb.toString();
    }
	
}
