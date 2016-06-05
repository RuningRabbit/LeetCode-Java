
public class Solution {
	private boolean flags = false;
	private int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public boolean exist(char[][] board, String word) {

		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]!=word.charAt(0)) continue;
				if (flags)
					return true;
				boolean[][] flag = new boolean[board.length][board[0].length];
				flag[i][j] = true;
				DFS(i, j, board, word, new String("" + board[i][j]), flag);
			}
		return flags;
	}

	public void DFS(int x, int y, char[][] board, String word, String str, boolean[][] flag) {
		if (flags)
			return;
		if (!word.startsWith(str)) 
			return;
		if(str.equals(word))
			flags=true;
		for (int i = 0; i < 4; i++) {
			int px = x + dir[i][0];
			int py = y + dir[i][1];
			if (px < 0 || py < 0 || px >= board.length || py >= board[0].length)
				continue;
			if (flag[px][py])
				continue;
			String a = str;
			str += board[px][py];
			flag[px][py] = true;
			DFS(px, py, board, word, str, flag);
			flag[px][py] = false;
			str = a;
		}
	}
	
}