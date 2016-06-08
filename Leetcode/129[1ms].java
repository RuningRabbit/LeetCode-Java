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
    private int S = 0;

	public int sumNumbers(TreeNode root) {

		if (root == null)
			return 0;
		DFS(root, 0);
		return S;
	}

	private void DFS(TreeNode root, int sum) {
		if (root == null)
			return;
		if (root.right == null && root.left == null)
			S += sum * 10 + root.val;

		sum = sum * 10 + root.val;
		DFS(root.left, sum);
		DFS(root.right, sum);
		sum = (sum - root.val) / 10;

	}
}