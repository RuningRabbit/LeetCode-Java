/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> L = new ArrayList<List<Integer>>();
		Queue<TreeNode> Q = new LinkedList<TreeNode>();

		if (root == null)
			return L;
		Q.offer(root);
		while (!Q.isEmpty()) {
			List<TreeNode> w = new ArrayList<TreeNode>();
			List<Integer> node = new ArrayList<Integer>();
			while (!Q.isEmpty()) {
				w.add(Q.peek());
				Q.poll();
			}
			for (TreeNode a : w) {
				node.add(a.val);
				if (a.left != null)
					Q.offer(a.left);
				if (a.right != null)
					Q.offer(a.right);
			}
			L.add(0,node);
			
		}
        return L;
	}
}