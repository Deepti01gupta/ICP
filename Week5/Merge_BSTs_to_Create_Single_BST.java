package Week5;

import java.util.*;

public class Merge_BSTs_to_Create_Single_BST {
	
//	https://leetcode.com/problems/merge-bsts-to-create-single-bst/

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
	
	Map<Integer, TreeNode> map;
    public TreeNode canMerge(List<TreeNode> trees) {
        map=new HashMap<>();
        Set<Integer> leaf=new HashSet<>();

        for(TreeNode root:trees){
            map.put(root.val, root);
            if(root.left!=null){
                leaf.add(root.left.val);
            }
            if(root.right!=null){
                leaf.add(root.right.val);
            }
        }

        TreeNode head=null;
        for(TreeNode root:trees){
            if(!leaf.contains(root.val)){
                head=root;
                break;
            }
        }

        if(head==null){
            return null;
        }

        if(!dfs(head,Integer.MIN_VALUE, Integer.MAX_VALUE)){
            return null;
        }

        return map.size()==1? head:null;
    }

    private boolean dfs(TreeNode node, int min, int max){
        if(node==null){
            return true;
        }

        if(node.val<=min || node.val>=max){
            return false;
        }

        if(node.left==null && node.right==null){
            TreeNode merge=map.get(node.val);
            if(merge!=null && merge!=node){
                node.left=merge.left;
                node.right=merge.right;
                map.remove(node.val);
            }
           
        }

        return dfs(node.left,min,node.val) && dfs(node.right, node.val, max);
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
