package Tree.src;
//Time: O(n)
//Space: O(h)
public class sumNumbers129 {
	 public int sumNumbers(TreeNode root) {
		    dfs(root, 0);
		    return ans;
		  }

		  private int ans = 0;

		  private void dfs(TreeNode root, int path) {
		    if (root == null)
		      return;
		    if (root.left == null && root.right == null) {
		      ans += path * 10 + root.val;
		      return;
		    }

		    dfs(root.left, path * 10 + root.val);
		    dfs(root.right, path * 10 + root.val);
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
