public class Solution {
   public int[][] generateMatrix(int n) {
		int[][] map = new int[n][n];
		for (int i = 0; i < map.length; i++)
			Arrays.fill(map[i], 0);

		int total = 0;
		int i = 0;
		int j = 0;
		while (total < n * n) {
			while (j < n && map[i][j] == 0)
				map[i][j++] = ++total;
			j--;
			i++;
			while (i < n && map[i][j] == 0)
				map[i++][j] = ++total;
			i--;
			j--;
			while (j >= 0 && map[i][j] == 0)
				map[i][j--] = ++total;
			j++;
			i--;
			while (i >= 0 && map[i][j] == 0)
				map[i--][j] = ++total;
			i++;
			j++;
		}
		return map;
	}
}