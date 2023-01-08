package Tree.src;

public class findTilt {
	public static int findTilt(TreeNode root) {
        sum(root);
        return ans;
}

private static int ans = 0;

private static int sum(TreeNode root) {
  if (root == null)
    return 0;

  final int l = sum(root.left);
  final int r = sum(root.right);
  ans += Math.abs(l - r);
  return root.val + l + r;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = TreeSample.createbstTree();
		System.out.println("counting nodes1="+findTilt(head));
		System.out.println("counting edges1="+findTilt(head));
		System.out.println("counting edges2="+findTilt(head));


	}

}
