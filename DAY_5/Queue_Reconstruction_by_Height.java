package DAY_5;

import java.util.*;

public class Queue_Reconstruction_by_Height {

	
//	https://leetcode.com/problems/queue-reconstruction-by-height/
	public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(b[0]==a[0]){
                    return a[1]-b[1];
                }
                return b[0]-a[0];
            }
        });

        List<int[]> ll=new ArrayList<>();
        for(int[] p:people){
            ll.add(p[1],p);
        }

        return ll.toArray(new int[people.length][2]);
    }
	
}
