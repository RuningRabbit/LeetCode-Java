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
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		if (root.right == null&&root.left==null && sum-root.val== 0)
			return true;
		sum -= root.val;
		boolean a=hasPathSum(root.left, sum);
		boolean b=hasPathSum(root.right, sum);
		sum += root.val;
		return a||b;
	}
}