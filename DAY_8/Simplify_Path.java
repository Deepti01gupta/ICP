package DAY_8;

import java.util.*;

public class Simplify_Path {

//	https://leetcode.com/problems/simplify-path/
	public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] str=path.split("/");
        for(String s:str){
            if(s.equals(".") || s.isEmpty()){
                continue;
            }
            else if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(s);
            }
        }
        return "/"+String.join("/",st);
    }
	
}
