package Tree.src;

import java.util.Stack;
//Time: O(n)
//Space: O(h)
public class flattenBinaryTree114 {
	 public void flatten(TreeNode root) {
	        if (root == null)
	            return;
	        Stack<TreeNode> stack =new Stack<TreeNode>();
	        stack.push(root);
	        
	        while(!stack.isEmpty()) {
	        	TreeNode curr =stack.pop();
	        	if(curr.right!=null) stack.push(curr.right);
	        	if(curr.left!=null) stack.push(curr.left);
	        	if(!stack.isEmpty()) {
	        		curr.right =stack.peek();
	        	}
	        	curr.left=null;
	        }
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
