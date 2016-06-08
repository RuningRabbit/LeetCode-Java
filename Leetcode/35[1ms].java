public class Solution {
    public static int searchInsert(int[] nums, int target) {
		
		
		int s = -1, e = nums.length;
		while (e - s > 1) {
			int mid = (s + e) / 2;
			if (nums[mid] >= target) {
				e = mid;				
			} else
				s = mid;
		}

		return s+1;
	}
}