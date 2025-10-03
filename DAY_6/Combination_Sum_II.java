package DAY_6;

import java.util.*;

public class Combination_Sum_II {

//	https://leetcode.com/problems/combination-sum-ii/
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ll=new ArrayList<>();
        Arrays.sort(candidates);
        fun(candidates,target,ll,new ArrayList<>(),0,0);
        return ll;
    }

    public void fun(int[] arr, int t, List<List<Integer>> ll, List<Integer> ans, int sum, int idx){
        if(sum==t){
            ll.add(new ArrayList<>(ans));
            return;
        }
        if(sum>t){
            return;
        }
        for(int i=idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            ans.add(arr[i]);
            fun(arr,t,ll,ans,sum+arr[i],i+1);
            ans.remove(ans.size()-1);
        }
    }
}
