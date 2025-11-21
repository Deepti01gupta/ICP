package DAY_13;
import java.util.*;

public class Stamping_The_Sequence {
	
//	https://leetcode.com/problems/stamping-the-sequence/
	public int[] movesToStamp(String stamp, String target) {
        char[] S = stamp.toCharArray();
        char[] T = target.toCharArray();
        int n = T.length, m = S.length;

        boolean[] visited = new boolean[n];  
        int replacedCount = 0;

        List<Integer> ans = new ArrayList<>();

        while (replacedCount < n) {
            boolean progress = false;

            for (int i = 0; i <= n - m; i++) {
                if (!visited[i] && canReplace(T, S, i)) {
                    int changed = doReplace(T, m, i);
                    if (changed > 0) {
                        replacedCount += changed;
                        visited[i] = true;
                        ans.add(i);
                        progress = true;

                        if (replacedCount == n) break;
                    }
                }
            }

            if (!progress) return new int[0];
        }

        // reverse result (because we unstamped)
        int size = ans.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = ans.get(size - 1 - i);
        }
        return res;
    }

    // Check if stamp can be placed at position i
    private boolean canReplace(char[] T, char[] S, int pos) {
        for (int j = 0; j < S.length; j++) {
            if (T[pos + j] != '?' && T[pos + j] != S[j]) {
                return false;
            }
        }
        return true;
    }

    // Perform replacement: make matched characters into '?'
    private int doReplace(char[] T, int m, int pos) {
        int changed = 0;
        for (int j = 0; j < m; j++) {
            if (T[pos + j] != '?') {
                T[pos + j] = '?';
                changed++;
            }
        }
        return changed;
    }
}
