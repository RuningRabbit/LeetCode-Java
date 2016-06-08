public class Solution {
	public int myAtoi(String str) {
	long sum = 0;
		int flag = 1;
		str=str.trim();
		int i = 0;
		if (str.length()==0)return 0;
		
		if (str.charAt(i) == '+')
			i++;
		else if (str.charAt(i) == '-') {
			flag = -1;
			i++;
		}

		while (i < str.length()) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sum = sum * 10 + flag * (str.charAt(i) - '0');
			} else
				return (int) sum;

			if (sum > Integer.MAX_VALUE)
				return 0x7fffffff;
			else if (sum < Integer.MIN_VALUE)
				return -0x80000000;
			i++;
		}
		return (int) sum;

    }
}
