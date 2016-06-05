public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
			return false;

		long sum = 0;
		long a = x;
		while (x != 0) {
			sum = sum * 10 + x % 10;
			x /= 10;
		}

		if (a == sum)
			return true;
		else
			return false;
	        
    }
}
