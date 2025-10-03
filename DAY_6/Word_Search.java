package DAY_6;

public class Word_Search {

//	https://leetcode.com/problems/word-search/
	public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(fun(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
        
    }

    public boolean fun(char[][] board, String word, int i, int j, int k){
        if(k==word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(k)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='_';

        int[] r={-1,0,1,0};
        int[] c={0,-1,0,1};
        for(int x=0; x<4; x++){
            if(fun(board,word,i+r[x],j+c[x],k+1)){
                board[i][j]=temp;
                return true;
            }
        }
        board[i][j]=temp;
        return false;
    }
}
