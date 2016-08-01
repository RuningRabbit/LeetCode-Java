public class Solution {

	public boolean flag = false;

	public void solveSudoku(char[][] board) {
		DFS(0, board);

	}

	public boolean Check(int x, char[][] board, char k) {
		int px = x / 9;
		int py = x % 9;
		for (int i = 0; i < 9; i++)
			if (board[px][i] == k)
				return false;
		for (int i = 0; i < 9; i++)
			if (board[i][py] == k)
				return false;

		for (int i = 3 * (px / 3); i < 3 * (px / 3) + 3; i++)
			for (int j = 3 * (py / 3); j < 3 * (py / 3) + 3; j++)
				if (board[i][j] == k)
					return false;

		return true;
	}

	public void DFS(int x, char[][] board) {
		if (flag)
			return;
		if (x > 80) {
			flag = true;
			return;
		}
		int px = x / 9;
		int py = x % 9;
		if (board[px][py] != '.')
			DFS(x + 1, board);
		else {
			for (int i = 1; i <= 9; i++)
				if (Check(x, board, (char) (i + '0'))) {
					board[px][py] = (char) (i + '0');
					DFS(x + 1, board);
					
					if(!flag)board[px][py] = '.';
				}
		}

	}

}

