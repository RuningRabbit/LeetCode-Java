public class Solution {
	public int minSubArrayLen(int s, int[] nums) {
		if (nums.length == 0)
			return 0;
		int left = 0, right = 0, sum = 0, len = nums.length, res = Integer.MAX_VALUE;
		while (right < len) {
			while (sum < s && right < len)
				sum += nums[right++];
			while (sum >= s) {
				res = Math.min(res, right - left);
				sum -= nums[left++];
			}
		}
		return res == Integer.MAX_VALUE ? 0 : res;
	}
}
