package Week1;

import java.util.*;

public class Spiral_Matrix {
	
//	https://leetcode.com/problems/spiral-matrix/
	
	public List<Integer> spiralOrder(int[][] matrix) {
        int minc=0;
        int maxc=matrix[0].length-1;
        int minr=0;
        int maxr=matrix.length-1;
        int t=matrix.length * matrix[0].length;
        int c=0;
        List<Integer> list = new ArrayList<>();
        while(c<t){
            for(int i=minc; i<=maxc && c<t; i++){
                list.add(matrix[minr][i]);
                c++;
            }
            minr++;
            for(int i=minr; i<=maxr && c<t; i++){
                list.add(matrix[i][maxc]);
                c++;
            }
            maxc--;
            for(int i=maxc; i>=minc && c<t; i--){
                list.add(matrix[maxr][i]);
                c++;
            }
            maxr--;
            for(int i=maxr; i>=minr && c<t; i--){
                list.add(matrix[i][minc]);
                c++;
            }
            minc++;
        }
        return list;
    }

}
