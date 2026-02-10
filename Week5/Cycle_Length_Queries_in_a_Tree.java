package Week5;

public class Cycle_Length_Queries_in_a_Tree {
	
//	https://leetcode.com/problems/cycle-length-queries-in-a-tree/

	// public int[] cycleLengthQueries(int n, int[][] queries) {
    //     int[] ans=new int[queries.length];

    //     for(int i=0; i<queries.length; i++){
    //         int v=solve(queries[i]);
    //         ans[i]=v;
    //     }

    //     return ans;
    // }

    // public int solve(int[] arr){
    //     int a=arr[0];
    //     int b=arr[1];

    //     int c=1;

    //     while(a!=b){
    //         if(a>b){
    //             a/=2;
    //         }
    //         else{
    //             b/=2;
    //         }
    //         c++;
    //     }

    //     return c;
    // }

    public int[] cycleLengthQueries(int n, int[][] queries) {
        int[] ans=new int[queries.length];

        for(int i=0; i<queries.length; i++){
            int v=fun(queries[i]);
            ans[i]=v;
        }

        return ans;
    }

    public int fun(int[] arr){
        int a=arr[0];
        int b=arr[1];

        int dis_a=depth(a);
        int dis_b=depth(b);

        int lca=findLCA(a,b);
        int dis_lca=depth(lca);

        int ans=((dis_a + dis_b) - (2*dis_lca)) +1;

        return ans;
    }

    public int depth(int n){
        if(n==1 || n==0){
            return 1;
        }
        return 1+depth(n/2);
    }

    public int findLCA(int a, int b) {
        while(a!=b){
            if(a>b){
                a/=2;
            }
            else{
                b/=2;
            }
        }
        return a;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
