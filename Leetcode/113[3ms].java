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

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> L = new ArrayList<List<Integer>>();
		List<Integer> x = new ArrayList<Integer>();
		if (root == null)
			return L;
		DFS(L, x, root, sum);
		return L;
	}

	void DFS(List<List<Integer>> L, List<Integer> x, TreeNode root, int sum) {
		if (root == null)
			return;
		if (root.right == null && root.left == null && sum - root.val == 0) {
			List<Integer> n = new ArrayList<Integer>(x);
			n.add(root.val);
			L.add(n);

		}
		x.add(root.val);
		sum -= root.val;
		DFS(L, x, root.left, sum);
		DFS(L, x, root.right, sum);
		sum += root.val;
		x.remove(x.size() - 1);
	}
}