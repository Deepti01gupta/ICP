package Week1;

public class Container_With_Most_Water {
	
//	https://leetcode.com/problems/container-with-most-water/
	
	public int maxArea(int[] height) {
        return max(height);
        
    }
    public int max(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        int sum=0;
        while(i<j){
            sum=Math.max(sum,(j-i) * Math.min(arr[j],arr[i]));
            if(arr[i]<arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
