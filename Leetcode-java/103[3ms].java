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
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> L = new ArrayList<List<Integer>>();
		Queue<TreeNode> Q = new LinkedList<TreeNode>();

		if (root == null)
			return L;

		Q.offer(root);
		int flag = 1;
		while (!Q.isEmpty()) {
			List<TreeNode> list = new ArrayList<TreeNode>();
			List<Integer> node = new ArrayList<Integer>();
			while (!Q.isEmpty()) {
				list.add(Q.peek());
				Q.poll();
			}
			for (TreeNode a : list) {
				node.add(a.val);
				if (a.left != null)
					Q.offer(a.left);
				if (a.right != null)
					Q.offer(a.right);
			}
			if (flag == -1) {
				List<Integer> temp = new ArrayList<Integer>();
				for (int i = node.size() - 1; i >= 0; i--)
					temp.add(node.get(i));
				L.add(temp);

			} else {
				L.add(node);
			}
			flag *= -1;
		}
		return L;
	}
}