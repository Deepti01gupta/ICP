package Week1;

import java.util.*;

public class Merge_Intervals {
	
//	https://leetcode.com/problems/merge-intervals/
	
	public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(n<=1){
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        int[] curr=intervals[0];
        ans.add(curr);


        for (int[] interval : intervals) {
            int End = curr[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= End) {
                curr[1] = Math.max(End, nextEnd);
            } else {
                curr = interval;
                ans.add(curr);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
