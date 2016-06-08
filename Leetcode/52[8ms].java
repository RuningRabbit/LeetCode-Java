public class Solution {
    int total=0;
	public  int totalNQueens(int n) {
		List<List<Integer>> pl = new ArrayList<List<Integer>>();
		List<Integer> sub = new ArrayList<Integer>();
		boolean[] flag = new boolean[n];
		DFS(n, pl, sub, flag);
		return total;
	}

	public void DFS(int n, List<List<Integer>> pl, List<Integer> sub, boolean[] flag) {
		if (sub.size() == n) {
			total++;
			return;
		}
		for (int i = 0; i < n; i++) {
			if (flag[i])
				continue;

			boolean flags = false;
			int x = sub.size();
			int y = i;
			for (int j = 0; j < x; j++) {
				if (x + y == j + sub.get(j))
					flags = true;
				if (x - j == y - sub.get(j))
					flags = true;
			}
			if (flags)
				continue;

			flag[i] = true;
			sub.add(i);
			DFS(n, pl, sub, flag);
			sub.remove(sub.size() - 1);
			flag[i] = false;
		}

	}
}