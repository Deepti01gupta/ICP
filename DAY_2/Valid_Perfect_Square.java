package DAY_2;

public class Valid_Perfect_Square {

//	https://leetcode.com/problems/valid-perfect-square/
	public boolean isPerfectSquare(int num) {

        long lo=1, hi=num;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            long sqrt=mid*mid;
            if(sqrt==num){
                return true;
            }
            else if(sqrt<num){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return false;


        // for(int i=1; ; i++){
        //     if(i*i==num){
        //         return true;
        //     }
        //     if(i*i>num){
        //         return false;
        //     }
        // }
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
