public class Solution {
    int total;

	public int uniquePaths(int m, int n) {
		int[][] dir = { { 0, 1 }, { 1, 0 }};
		total = 0;
		DFS(0, 0, m, n, dir);
		return total;
	}

	public void DFS(int x, int y, int m, int n, int[][] dir) {
		if (x == m - 1 && y == n - 1) {
			total++;
			return;
		}
		for (int i = 0; i < 2; i++) {
			int px = x + dir[i][0];
			int py = y + dir[i][1];
			
			if (px >= 0 && py >= 0 && px < m && py < n){
				DFS(px, py, m, n, dir);
			}
		}
	}

}