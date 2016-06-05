public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
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
			sub.add(nums[i]);
			DFS(nums, i + 1, pl, sub);
			sub.remove(sub.size() - 1);

		}

	}
}