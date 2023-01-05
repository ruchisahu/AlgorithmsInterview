package Tree.src;
//Time: O(n)O(n)
//Space: O(h)O(h)
public class hasPathSum {
	 public boolean hasPathSum(TreeNode root, int sum) {
	        if(root==null)return false;
	        if(root.left==null && root.right==null && root.val-sum==0)return true;
	        
	        return hasPathSum(root.left,sum-root.val) ||hasPathSum(root.right,sum-root.val);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
