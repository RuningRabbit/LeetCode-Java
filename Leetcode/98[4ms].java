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
	public boolean isValidBST(TreeNode root) {
		List<Integer> L = new ArrayList<Integer>();
		DFS(root, L);
		for (int i = 1; i < L.size(); i++)
			if (L.get(i - 1) >= L.get(i))
				return false;
		return true;
	}

	public void DFS(TreeNode root, List<Integer> L) {
		if (root == null)
			return;
		
		DFS(root.left, L);
		L.add(root.val);
		DFS(root.right, L);
	}
}