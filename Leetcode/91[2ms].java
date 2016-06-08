
public class Solution {
	public int numDecodings(String s) {
		if (s.length() == 0)
			return 0;
		if(s.charAt(0) == '0') return 0;
		if (s.length() == 1)
			return (s.charAt(0) != '0') ? 1 : 0;

		if (s.length() == 2)
			return ((s.charAt(0) != '0' && s.charAt(1) != '0') ? 1 : 0)
					+ ((s.charAt(0) != '0' && ((int) (s.charAt(0) - '0') * 10 + (int) (s.charAt(1) - '0')) < 27) ? 1
							: 0);
		int[] dp = new int[s.length()];

		dp[0] = (s.charAt(0) != '0') ? 1 : 0;
		dp[1] = ((s.charAt(0) != '0' && s.charAt(1) != '0') ? 1 : 0)
				+ ((s.charAt(0) != '0' && ((int) (s.charAt(0) - '0') * 10 + (int) (s.charAt(1) - '0')) < 27) ? 1 : 0);
		for (int i = 2; i < s.length(); i++) {
			dp[i] = 0;
			if (s.charAt(i) != '0') {
				dp[i] += dp[i - 1];
			}

			if (s.charAt(i - 1) != '0' && (int) (s.charAt(i - 1) - '0') * 10 + (int) (s.charAt(i) - '0') < 27) {
				dp[i] += dp[i - 2];
			}
		}
		return dp[s.length()-1];
	}
}