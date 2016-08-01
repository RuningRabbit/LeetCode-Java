import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> L = new ArrayList<Integer>();
		Queue<TreeNode> Q = new LinkedList<TreeNode>();
		if (root == null)
			return L;

		Q.offer(root);
		L.add(root.val);
		while (!Q.isEmpty()) {
			List<TreeNode> node = new ArrayList<TreeNode>();
			while (!Q.isEmpty()) {
				node.add(Q.peek());
				Q.poll();
			}
			int data = 0;
			for (TreeNode tree : node) {
				if (tree.left != null) {
					Q.offer(tree.left);
					data = tree.left.val;
				}
				if (tree.right != null) {
					Q.offer(tree.right);
					data = tree.right.val;
				}
			}
			if (data != 0)
				L.add(data);

		}
		return L;
	}
}
