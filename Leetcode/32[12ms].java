public class Solution {
	public int longestValidParentheses(String s) {
		boolean[] dp = new boolean[s.length()];
		Stack<Integer> S = new Stack<Integer>();
		Arrays.fill(dp, false);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				S.push(i);
			else if (s.charAt(i) == ')' && !S.empty()) {
				dp[i] = true;
				dp[S.peek()] = true;
				S.pop();
			}
		}

		int max = 0, len = 0;

		for (int i = 0; i < dp.length; i++) {
			if (dp[i])
				len++;
			else
				len = 0;
			max = Math.max(max, len);
		}
		return max;

	}
}
