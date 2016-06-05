import java.util.Arrays;

public class Solution {
	public static String multiply(String num1, String num2) {

		boolean flag1 = false, flag2 = false;
		if (num1.charAt(0) == '-')
			flag1 = true;
		if (num2.charAt(0) == '-')
			flag2 = true;
		int[] num = new int[num1.length() + num2.length()];

		Arrays.fill(num, 0);

		for (int i = num1.length() - 1, w = num.length - 1; i >= 0; i--, w--)
			for (int j = num2.length() - 1, k = w; j >= 0; j--, k--)
				if (num1.charAt(i) != '-' && num1.charAt(i) != '+' && num2.charAt(j) != '-' && num2.charAt(j) != '+')
					num[k] += (int) (num1.charAt(i) - '0') * (int) (num2.charAt(j) - '0');

		for (int i = num.length - 1; i > 0; i--) {
			int go = num[i] / 10;
			num[i] = num[i] % 10;
			num[i - 1] += go;
		}

		int i = 0;
		while (i < num.length - 1) {
			if (num[i] != 0)
				break;
			i++;
		}
		StringBuffer res = new StringBuffer("");
		while (i < num.length) {
			res.append((char) ('0' + num[i]));
			i++;
		}
		
		if (flag1 ^ flag2) {
			res.insert(0, '-');
			return res.toString();
		}
		return res.toString();

	}

	
}