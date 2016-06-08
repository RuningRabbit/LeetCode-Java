public class Solution {
    public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {

			if (isAc(s.charAt(i)) && isAc(s.charAt(j))) {
				if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
					i++;
					j--;
				} else
					return false;
			} else {
				if (!isAc(s.charAt(i)))

					i++;

				if (!isAc(s.charAt(j)))
					j--;
			}
		}
		return true;
	}

	public boolean isAc(char ch) {
		if (Character.isLetter(ch) || Character.isDigit(ch))
			return true;
		return false;
	}

}