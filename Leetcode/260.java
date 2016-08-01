public class Solution {
	public int[] singleNumber(int[] nums) {
		int[] res = { 0, 0 };
		int result = nums[0];
		for (int i = 1; i < nums.length; i++)
			result = result ^ nums[i];

		for (int i = 0; i < nums.length; i++)
			if ((result & -result & nums[i]) != 0)
				res[0] ^= nums[i];
			else
				res[1] ^= nums[i];

		return res;
	}
}
