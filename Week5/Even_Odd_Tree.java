package Week5;

import java.util.*;

public class Even_Odd_Tree {
	
//	https://leetcode.com/problems/even-odd-tree/
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
		 	this.left = left;
		 	this.right = right;
		}
	}
	
	public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int l=0;
        while(!q.isEmpty()){
            int n=q.size();
            int prev=(l%2==0)? Integer.MIN_VALUE:Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                TreeNode node=q.poll();
                int val=node.val;

                if(l%2==0){
                    if(val%2==0 || val<=prev){
                        return false;
                    }
                }
                else{
                    if(val%2!=0 || val>=prev){
                        return false;
                    }
                }
                prev=val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            l++;
        }
        return true;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
