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
	public List<TreeNode> generateTrees(int n) {
		List<TreeNode> res = new ArrayList<TreeNode>();
		if (n == 0)
			return res;
		DFS(res, 1, n);
		return res;
	}

	private void DFS(List<TreeNode> res, int start, int end) {

		if (start > end) {
			res.add(null);
			return;
		}

		for (int i = start; i <= end; i++) {
			List<TreeNode> left = new ArrayList<TreeNode>();
			DFS(left, start, i - 1);
			List<TreeNode> right = new ArrayList<TreeNode>();
			DFS(right, i + 1, end);
			for (TreeNode l : left) {
				for (TreeNode r : right) {

					TreeNode root = new TreeNode(i);
					root.left = l;
					root.right = r;
					res.add(root);
				}
			}
		}

	}
}