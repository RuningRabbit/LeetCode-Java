/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> L=new ArrayList<Integer>();
    	DFS(root,L);
    	return L;
    }
    public void DFS(TreeNode root,List<Integer> L){
    	if(root==null) return;
    	DFS(root.left,L);
    	L.add(root.val);
    	DFS(root.right,L);
    	
    }
}