import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	private class point {
		private int x, y;
		private point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	private int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
	public void solve(char[][] board) {
		int n = board.length;
		if (n == 0)
			return;
		int m = board[0].length;

		for (int i = 0; i < n; i++) {
			if (board[i][0] == 'O')
				bfs(i, 0, board);
			if (board[i][m - 1] == 'O')
				bfs(i, m - 1, board);
		}

		for (int i = 0; i < m; i++) {
			if (board[0][i] == 'O')
				bfs(0, i, board);
			if (board[n - 1][i] == 'O')
				bfs(n - 1, i, board);
		}

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				if (board[i][j] == 'E')
					board[i][j] = 'O';
				else if (board[i][j] == 'O')
					board[i][j] = 'X';
			}
	}

	private void bfs(int x, int y, char[][] board) {
		Queue<point> Q = new LinkedList<point>();

		Q.offer(new point(x, y));
		board[x][y] = 'E';
		while (!Q.isEmpty()) {
			point P = Q.peek();
			Q.poll();

			for (int i = 0; i < 4; i++) {
				int px = P.x + dir[i][0];
				int py = P.y + dir[i][1];
				if (px >= 0 && py >= 0 && px < board.length && py < board[0].length && board[px][py] == 'O') {
					board[px][py] = 'E';
					Q.offer(new point(px, py));
				}
			}
		}
	}
}