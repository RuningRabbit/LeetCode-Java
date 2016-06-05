public class Solution {
	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null)
			return 0;

		int h = haystack.length();
		int n = needle.length();

		if (n > h)
			return -1;
		if (n == 0)
			return 0;

		return KMP(haystack, needle);
	}

	private int[] Match(String needle) {
		int[] next = new int[needle.length()];
		next[0] = 0;
	 
		for (int i = 1; i < needle.length(); i++) {
			int index = next[i - 1];
			while (index > 0 && needle.charAt(index) != needle.charAt(i)) {
				index = next[index - 1];
			}
	 
			if (needle.charAt(index) == needle.charAt(i)) {
				next[i] = next[i - 1] + 1;
			} else {
				next[i] = 0;
			}
		}
	 
		return next;
	}

	public int KMP(String all, String s) {
		int v[];
		v = Match(s);

		int i = 0, j = 0, k = 0;
		while (i < all.length()) {
			int ans = 0;
			k = i;
			for (j = 0; j < s.length() && i < all.length(); j++) {
				if (all.charAt(i) == s.charAt(j)) {
					ans++;
					i++;
				} else {
					i++;
					break;
				}
			}
			if (ans == s.length()) {
				return k;
			}
			if (ans != 0) {
				i = k + (ans - v[j - 1]);
			}
		}
		return -1;
	}
}