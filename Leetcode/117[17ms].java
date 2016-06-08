/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		Queue<TreeLinkNode> Q = new LinkedList<TreeLinkNode>();
		Q.offer(root);
		while (!Q.isEmpty()) {
			List<TreeLinkNode> w = new ArrayList<TreeLinkNode>();
			while (!Q.isEmpty()) {
				if (Q.peek().left != null)
					w.add(Q.peek().left);
				if (Q.peek().right != null)
					w.add(Q.peek().right);
				Q.poll();
			}

			for (int i = 0; i < w.size(); i++) {
				Q.offer(w.get(i));
				if (i < w.size() - 1)
					w.get(i).next = w.get(i + 1);
			}

		}
	}
}