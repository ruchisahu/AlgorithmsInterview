package Tree.src;

public class maxDepth {
	public int maxDepth(TreeNode root) {
	    if (root == null)
	      return 0;
	    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
