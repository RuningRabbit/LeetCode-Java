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
    public TreeNode sortedArrayToBST(int[] nums) {
    	return DFS(nums, 0,nums.length-1);
    }
    private TreeNode DFS(int[] nums,int start,int end){
    	if(start>end)return null;
    	if(start==end){
    		return new TreeNode(nums[start]);
    	}
    	else{
    		int mid=(start+end)/2;
    		TreeNode node=new TreeNode(nums[mid]);
    		node.left=DFS(nums,start,mid-1);
    		node.right=DFS(nums,mid+1,end);
    		return node;
    	}
    }
}
