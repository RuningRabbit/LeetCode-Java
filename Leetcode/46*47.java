import java.util.*;

public class Sulution {

	public List<List<Integer>> permute(int[] nums) {
		boolean[] flag = new boolean[nums.length];
		List<List<Integer>> L = new ArrayList<List<Integer>>();
		List<Integer> app = new ArrayList<Integer>();
		Map<List<Integer>, Boolean> map = new HashMap<List<Integer>, Boolean>();
		DFS(0, nums, flag, app, L, map);
		return L;
	}

	public void DFS(int x, int[] nums, boolean[] flag, List<Integer> app, List<List<Integer>> L,
			Map<List<Integer>, Boolean> map) {
		if (x >= nums.length) {
			if (map.get(app) != null)
				return;

			List<Integer> c = new ArrayList<Integer>(app);
			L.add(c);
			map.put(app, true);
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (!flag[i]) {

				app.add(nums[i]);
				flag[i] = true;
				DFS(x + 1, nums, flag, app, L, map);
				flag[i] = false;
				app.remove(app.size() - 1);
			}
		}
	}


}
