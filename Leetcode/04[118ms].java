import java.util.*;
public class Solution {
	public String longestPalindrome(String s) {
		int max = 1, start = 0, end = 0;
		boolean[][] dp = new boolean[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++)
			Arrays.fill(dp[i],true);
		for (int v = 1; v < s.length(); v++)
			for (int i = 0; i < s.length() - v; i++) {
				int j = i + v;

				if (s.charAt(i) == s.charAt(j)) {
					dp[i][j] = dp[i + 1][j - 1];
					if (dp[i][j] && j - i + 1 > max) {
						max = j - i + 1;
						start = i;
						end = j;
					}
				} else
					dp[i][j] = false;
			}
		return s.substring(start, end + 1);
	}
}

