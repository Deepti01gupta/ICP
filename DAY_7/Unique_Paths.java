package DAY_7;

import java.util.*;

public class Unique_Paths {

//	https://leetcode.com/problems/unique-paths/
	public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return path(m,n,0,0,dp);
    }
    public int path(int m, int n, int i, int j, int[][] dp){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i<0 || j<0 || i>=m || j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int sum=path(m,n,i,j+1,dp) + path(m,n,i+1,j,dp);
        return dp[i][j]=sum;
    }
}
