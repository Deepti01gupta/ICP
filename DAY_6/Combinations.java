package DAY_6;

import java.util.*;

public class Combinations {

//	https://leetcode.com/problems/combinations/
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ll=new ArrayList<>();
        fun(n,k,ll,new ArrayList<>(),1);
        return ll;
    }

    public void fun(int n, int k, List<List<Integer>> ll, List<Integer> ans, int idx){
        if(ans.size()==k){
            ll.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx; i<=n; i++){
            ans.add(i);
            fun(n,k,ll,ans,i+1);
            ans.remove(ans.size()-1);
        }
    }
}
