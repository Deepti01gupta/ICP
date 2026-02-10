package Week5;

public class Maximum_Product_of_Splitted_Binary_Tree {
	
//	https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/
	
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

	long ans=0;
    public int maxProduct(TreeNode root) {
        long total=findtotal(root);

        find(root,total);
        return (int)(ans % 1_000_000_007);

    }

    public long find(TreeNode root, long total){
        if(root.left==null && root.right==null){
            ans=Math.max(ans, (total-root.val)*(root.val));
            return root.val;
        }
        long sum=0;
        if(root.left!=null){
            sum+=find(root.left,total);
        }
        if(root.right!=null){
            sum+=find(root.right,total);
        }
        ans=Math.max(ans,(total-sum-root.val)*(sum+root.val));
        return sum+root.val;
    }

    public long findtotal(TreeNode root){
        if(root.left==null && root.right==null){
            return root.val;
        }

        long sum=0;
        if(root.left!=null){
            sum+=findtotal(root.left);
        }
        if(root.right!=null){
            sum+=findtotal(root.right);
        }

        return sum+root.val;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
