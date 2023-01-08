package Tree.src;
//https://leetcode.com/problems/trim-a-binary-search-tree/description/
public class trimBST {
	public static TreeNode trimBST(TreeNode root, int low, int high) {
	    if (root == null)
	      return null;
	    if (root.val < low)
	      return trimBST(root.right, low, high);
	    if (root.val > high)
	      return trimBST(root.left, low, high);
	    root.left = trimBST(root.left, low, high);
	    root.right = trimBST(root.right, low, high);
	    return root;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = TreeSample.createbstTree();
		
		System.out.println(PrintTree.TraversalIter(trimBST(head,3,6)));
		

	}

	

}
