public class Solution {
    public int jump(int[] nums) {
        int longest=0;
        int ret=0;
        int rl=0;
        
        for(int i=0;i<nums.length;i++){
        	if(rl<i){
        		ret++;
        		rl=longest;
        	}
        	longest=Math.max(longest, nums[i]+i);
        }
        return ret;
    }
}
