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
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return DFS(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
	}

	private TreeNode DFS(int[] preorder, int[] inorder, int px, int py, int ix, int iy) {
		if (px > py)safa
			return null;
		int point = preorder[px];
		int i = ix;
		while (i < iy) {
			if (inorder[i] == point)
				break;
			i++;
		}
		TreeNode node = new TreeNode(point);
		int len = i - ix;
		node.left = DFS(preorder, inorder, px + 1, px + len, ix, i - 1);
		node.right = DFS(preorder, inorder, px + len + 1, py, i + 1, iy);
		return node;
	}
}