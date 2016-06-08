import java.util.ArrayList;

public class Solution {
	public String getPermutation(int n, int k) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			numberList.add(i);
		}
		k--;
		int mod = 1;
		for (int i = 1; i <= n; i++) {
			mod = mod * i;
		}
		String result = "";
		for (int i = 0; i < n; i++) {
			mod /= n - i;
			int curIndex = k / mod;
			k %= mod;
			result += numberList.get(curIndex);
			numberList.remove(curIndex);
		}
		return result.toString();
	}
}