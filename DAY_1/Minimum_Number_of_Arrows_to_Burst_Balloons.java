package DAY_1;

import java.util.*;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
	
//	https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
	public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)->{
            return a[1]-b[1];
        });
        int end=points[0][1];
        int ans=1;
        for(int i=1; i<points.length; i++){
            if(points[i][0]<=end && end<=points[i][1]){
                continue;
            }
            else{
                ans++;
                end=points[i][1];
            }
        }
        return ans;
    }
}
