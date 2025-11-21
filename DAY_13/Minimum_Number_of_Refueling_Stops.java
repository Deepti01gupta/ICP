package DAY_13;
import java.util.*;

public class Minimum_Number_of_Refueling_Stops {

//	https://leetcode.com/problems/minimum-number-of-refueling-stops/
	public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        int stop=0;
        while(startFuel<target){
            while(i<stations.length && startFuel>=stations[i][0]){
                pq.add(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()){
                return -1;
            }
            startFuel+=pq.poll();
            stop++;
        }
        return stop;
    }
}
