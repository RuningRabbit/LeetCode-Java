public class Solution {
    public boolean canJump(int[] nums) {
		if(nums.length==0||nums.length==1)return true;
		int max=nums[0];
		for(int i=1;i<nums.length;i++){
			if(max==0) return false;
			max--;
			max=Math.max(max, nums[i]);
			
		}
		return true;
	}

}