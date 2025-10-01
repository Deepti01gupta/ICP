package DAY_5;

import java.util.*;

public class Non_overlapping_Intervals {

//	https://leetcode.com/problems/non-overlapping-intervals/
	public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr, (a,b)->{
            return a[1]-b[1];
        });
        int ans=0;
        int end=arr[0][1];
        for(int i=1; i<arr.length; i++){
            if(arr[i][0]<end){
                ans++;
            }
            else{
                end=arr[i][1];
            }
        }
        return ans;
    }
	
}
