import java.util.*;

public class Solution {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Set<List<Integer>> hash = new HashSet<List<Integer>>();
		if (nums.length < 3)
			return result;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || nums[i] > nums[i - 1]) {
				int s = i + 1;
				int e = nums.length - 1;
				while (s < e) {
					if (nums[s] + nums[e] + nums[i] == 0) {
						List<Integer> a = new ArrayList<>();
						a.add(nums[i]);
						a.add(nums[s]);
						a.add(nums[e]);
						s++;
						e--;
						if (!hash.contains(a)) {
							hash.add(a);
							result.add(a);
						}
					} else if (nums[s] + nums[e] + nums[i] < 0)
						s++;
					else
						e--;

				}
			}
		}
		return result;
	}

}