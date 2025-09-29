package DAY_3;

import java.util.*;

public class Spiral_Matrix {

//	https://leetcode.com/problems/spiral-matrix/
	public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int rs=0;
        int re=n-1;
        int cs=0;
        int ce=m-1;
        int t=m*n;
        int c=0;
        List<Integer> ll=new ArrayList<>();
        while(c<t){
            for(int j=cs; j<=ce && c<t; j++){
                ll.add(matrix[rs][j]);
                c++;
            }
            rs++;

            for(int i=rs; i<=re && c<t; i++){
                ll.add(matrix[i][ce]);
                c++;
            }
            ce--;

            for(int j=ce; j>=cs && c<t; j--){
                ll.add(matrix[re][j]);
                c++;
            }
            re--;

            for(int i=re; i>=rs && c<t; i--){
                ll.add(matrix[i][cs]);
                c++;
            }
            cs++;
        }
        return ll;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
