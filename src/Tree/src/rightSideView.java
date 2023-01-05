package Tree.src;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class rightSideView {
	
	 public static List<Integer> rightSideView(TreeNode root) {
		 if (root == null)
		      return new ArrayList<>();

		    List<Integer> ans = new ArrayList<>();
		    Queue<TreeNode> q = new ArrayDeque<>(Arrays.asList(root));

		    while (!q.isEmpty()) {
		      final int size = q.size();
		      for (int i = 0; i < size; ++i) {
		        TreeNode node = q.poll();
		        if (i == size - 1)
		          ans.add(node.val);
		        if (node.left != null)
		          q.offer(node.left);
		        if (node.right != null)
		          q.offer(node.right);
		      }
		    }

		    return ans;
		  }
	        
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSample T=new TreeSample();
		TreeNode root=T.createbstTree();
		System.out.println(rightSideView(root));

	}

}
