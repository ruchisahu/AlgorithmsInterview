package Tree.src;

import java.util.ArrayDeque;
import java.util.LinkedList;
//Time: O(n)O(n)
//Space: O(n)O(n)
import java.util.Queue;

public class minDepth {
	 public int minDepth(TreeNode root) {
         if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        queue.add(root);
        while (queue.size() > 0) {
            depth++;
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) return depth;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                size--;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
