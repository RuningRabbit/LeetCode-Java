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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if (root.right == null && root.left == null)
            return true;
        if (Math.abs(depth(root.right) - depth(root.left)) > 1)
            return false;
        return isBalanced(root.right) && isBalanced(root.left);
    }

    public int depth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(depth(root.right), depth(root.left)) + 1;
    }
}