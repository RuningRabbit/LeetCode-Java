public class Solution {
    public int removeDuplicates(int[] nums) {
		if(nums.length==0) return 0;
		if(nums.length==1) return 1;
		
		int count = 2;
		for (int i = 2; i < nums.length; i++) {
			
			if (nums[i] == nums[count-2])
				continue;
			else {
				nums[count]=nums[i];
				count++;
			}
		}
		return count;
	}
    
}