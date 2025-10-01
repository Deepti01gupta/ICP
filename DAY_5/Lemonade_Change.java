package DAY_5;

public class Lemonade_Change {

	
//	https://leetcode.com/problems/lemonade-change/
	public boolean lemonadeChange(int[] bills) {
        int c5=0;
        int c10=0;
        for(int i=0; i<bills.length; i++){
            if(bills[i]==5){
                c5++;
            }
            else if(bills[i]==10){
                c10++;
                c5--;
                if(c5<0){
                    return false;
                }
            }
            else{
                if(c10>=1 && c5>=1){
                    c10--;
                    c5--;
                }
                else{
                    c5=c5-3;
                    if(c5<0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
	
}
