public class Solution {
    public String reverseWords(String s) {
		StringBuffer str = new StringBuffer("");
		for (int i = 0; i < s.length(); i++) {
			StringBuffer string = new StringBuffer("");
			while (i < s.length() && s.charAt(i) != ' ') {
				string.append(s.charAt(i));
				i++;
			}
			if (!string.toString().equals(""))
				str.insert(0, string + " ");
		}
		return str.toString().trim();
	}
}
