package DAY_5;

import java.util.*;

public class Boats_to_Save_People {

	
//	https://leetcode.com/problems/boats-to-save-people/
	public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(int i=people.length-1; i>=0; i--){
            if(!st.isEmpty() && people[i]+people[st.peek()]<=limit){
                ans++;
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        while(!st.isEmpty()){
            ans++;
            st.pop();
        }
        return ans;
    }
	
}
