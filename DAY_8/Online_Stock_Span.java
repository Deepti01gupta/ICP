package DAY_8;

import java.util.*;

public class Online_Stock_Span {

//	StockSpanner obj = new StockSpanner();
//	int param_1 = obj.next(price);
	
	Stack<Pair> st=new Stack<>();
    class Pair{
        int first, second;
        Pair(int i, int j){
            this.first=i; 
            this.second=j;
        }
    }
    int idx=-1;
    public Online_Stock_Span() {
        idx=-1;
        st.clear();
    }
    
    public int next(int price) {
        idx+=1;
        while(!st.empty() && st.peek().first<=price){
            st.pop();
        }
        int ans=(st.empty())? -1:st.peek().second;
        st.push(new Pair(price,idx));
        return idx-ans;
    }
    
}
