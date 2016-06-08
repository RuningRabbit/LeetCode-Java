import java.util.*;

public class Solution {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> pl = new ArrayList<List<Integer>>();
		List<Integer> sub = new ArrayList<Integer>();
		DFS(n, k, 1, pl, sub);
		return pl;
	}

	public void DFS(int n, int k, int start, List<List<Integer>> pl, List<Integer> sub) {
		if (sub.size() == k) {
			List<Integer> c = new ArrayList<Integer>(sub);
			pl.add(c);
			return;
		}
		for (int i = start; i <= n; i++) {

			sub.add(i);
			DFS(n, k, i + 1, pl, sub);
			sub.remove(sub.size() - 1);

		}

	}

}