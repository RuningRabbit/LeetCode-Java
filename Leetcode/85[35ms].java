import java.util.Stack;

public class Solution {
	public int largestRectangleArea(int[] heights) {
		Stack<Integer> s = new Stack<Integer>();

		int i = 0;
		int max = 0;
		while (i < heights.length) {
			if (s.empty() || heights[s.peek()] <= heights[i])
				s.push(i++);
			else {
				int t = s.pop();
				max = Math.max(max, heights[t] * (s.empty() ? i : i - s.peek() - 1));
			}
		}

		int len = heights.length;
		while (!s.empty()) {
			int t = s.pop();
			max = Math.max(max, heights[t] * (s.empty() ? len : len - s.peek() - 1));
		}
		return max;
	}

	public int maximalRectangle(char[][] matrix) {
		if (matrix.length == 0)
			return 0;
		if (matrix[0].length == 0)
			return 0;

		int[][] dp = new int[matrix.length][matrix[0].length];

		for (int j = 0; j < matrix[0].length; j++)
			dp[0][j] = matrix[0][j] == '1' ? 1 : 0;

		for (int i = 1; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				if (matrix[i][j] == '1')
					dp[i][j] = dp[i - 1][j] + 1;

		int max = 0;
		for (int i = 0; i < matrix.length; i++)
			max = Math.max(max, largestRectangleArea(dp[i]));

		return max;
	}
}
