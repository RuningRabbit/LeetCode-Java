import java.util.ArrayList;
import java.util.List;



public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
		final int INF=-0x7ffffff;
		List<Integer> L = new ArrayList<Integer>();
		if (matrix == null)
			return L;
		int m = matrix.length;
		if (m == 0)
			return L;
		int n = matrix[0].length;

		int total = 0, i = 0, j = 0;
		while (total < m * n) {
			while (j < n && matrix[i][j] != INF) {
				L.add(matrix[i][j]);
				matrix[i][j] = INF;
				j++;
				total++;
			}
			j--;
			i++;
			while (i < m && matrix[i][j] != INF) {
				L.add(matrix[i][j]);
				matrix[i][j] = INF;
				i++;
				total++;
			}
			i--;
			j--;
			while (j >= 0 && matrix[i][j] != INF) {
				L.add(matrix[i][j]);
				matrix[i][j] = INF;
				j--;
				total++;
			}
			j++;
			i--;
			while (i >= 0 && matrix[i][j] != INF) {
				L.add(matrix[i][j]);
				matrix[i][j] = INF;
				i--;
				total++;
			}
			i++;
			j++;
		}
		return L;
	}
}