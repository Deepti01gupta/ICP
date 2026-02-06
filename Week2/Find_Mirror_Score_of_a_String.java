package Week2;

import java.util.*;

public class Find_Mirror_Score_of_a_String {
	
//	https://leetcode.com/problems/find-mirror-score-of-a-string/
	
	public long calculateScore(String s) {

        // BRUTE FORCE
        // int n=s.length();
        // boolean[] visited=new boolean[n];
        // long score=0;

        // Map<Character,List<Integer>> map=new HashMap<>();
        // for(int i=0; i<n; i++){
        //     char ch=s.charAt(i);
        //     map.putIfAbsent(ch,new ArrayList<>());
        //     map.get(ch).add(i);
        // }
        // for(int i=0; i<n; i++){
        //     if(visited[i]){
        //         continue;
        //     }
        //     char curr=s.charAt(i);
        //     char mirror=(char)('z'-(curr-'a'));

        //     if(!map.containsKey(mirror)){
        //         continue;
        //     }

        //     List<Integer> idx=map.get(mirror);

        //     int j=-1;
        //     for(int t:idx){
        //         if(t<i && !visited[t]){
        //             j=t;
        //         }
        //     }

        //     if(j!=-1){
        //         visited[i]=true;
        //         visited[j]=true;
        //         score+=(i-j);
        //     }
        // }
        // return score;

        int n = s.length();
        Map<Character, Stack<Integer>> map=new HashMap<>();
        long score=0;

        for(int i=0; i<n; i++){
            char c=s.charAt(i);
            char mirror=(char)('z'-(c-'a'));

            if (map.containsKey(mirror) && !map.get(mirror).isEmpty()) {
                score += (i - map.get(mirror).pop());
            }
            else{
                map.computeIfAbsent(c,_ -> new Stack<>()).push(i);
            }
        }
        return score;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
