package DAY_3;

public class Search_a_2D_Matrix {

//	https://leetcode.com/problems/search-a-2d-matrix/
	public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
