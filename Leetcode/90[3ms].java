import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> pl = new ArrayList<List<Integer>>();
		List<Integer> sub = new ArrayList<Integer>();
		DFS(nums, 0, pl, sub);
		return pl;
	}

	public void DFS(int[] nums, int start, List<List<Integer>> pl, List<Integer> sub) {
		if (sub.size() <= nums.length) {
			List<Integer> c = new ArrayList<Integer>(sub);
			pl.add(c);

		}
		for (int i = start; i < nums.length; i++) {
			if(i!=start&&nums[i]==nums[i-1]) continue;
			sub.add(nums[i]);
			DFS(nums, i + 1, pl, sub);
			sub.remove(sub.size() - 1);

		}

	}

}