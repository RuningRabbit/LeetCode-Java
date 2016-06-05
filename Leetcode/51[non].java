import java.util.ArrayList;
import java.util.List;

public class Solution {
	public void solveNQueens(int n) {
		List<List<Integer>> pl = new ArrayList<List<Integer>>();
		List<Integer> sub = new ArrayList<Integer>();
		boolean[] flag = new boolean[n];
		DFS(n, pl, sub, flag);
		List<List<String>> S = new ArrayList<List<String>>();
		StringBuffer a = new StringBuffer("");
		for (int i = 0; i < n; i++)
			a.append('.');

		for (List<Integer> l:pl) {
			List<String> ll = new ArrayList<String>();
			for (Integer k:l) {
				StringBuffer ss = new StringBuffer(a);
				ss.setCharAt(k, 'Q');
				ll.add(ss.toString());
			}
			S.add(ll);
		}
	}

	public void DFS(int n, List<List<Integer>> pl, List<Integer> sub, boolean[] flag) {
		if (sub.size() == n) {
			List<Integer> c = new ArrayList<Integer>(sub);
			pl.add(c);
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