public class Solution {
	private int ans;
	
	private int dfs(TreeNode root){
		if(root==null) return 0;
		int left=dfs(root.left);
		int right=dfs(root.right);
		int val=root.val;
		if(left>0)val+=left;
		if(right>0)val+=right;
		ans=Math.max(val, ans);
		return Math.max(root.val,Math.max(root.val+left,root.val+right));
		
	}
	
	public int maxPathSum(TreeNode root) {
		if(root==null) return 0;
		ans=root.val;
		dfs(root);
		return ans;
	}
}
