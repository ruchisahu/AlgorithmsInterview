package Tree.src;

public class insertIntoBST {
	public static TreeNode insertIntoBST(TreeNode root, int val) {
	    if (root == null)
	      return new TreeNode(val);
	    if (root.val > val)
	      root.left = insertIntoBST(root.left, val);
	    else
	      root.right = insertIntoBST(root.right, val);
	    return root;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = TreeSample.createbstTree();
		
		System.out.println(PrintTree.TraversalIter(insertIntoBST(head,9)));
		


	}

}
