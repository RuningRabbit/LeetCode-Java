import java.util.*;

public class Solution {

	public List<List<Integer>> fourSum(int[] num, int target) {
		Arrays.sort(num);

		HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < num.length - 3; i++) {
			if (i == 0 || num[i] > num[i - 1]) {
				for (int j = i + 1; j < num.length - 2; j++) {
					int k = j + 1;
					int l = num.length - 1;

					while (k < l) {
						int sum = num[i] + num[j] + num[k] + num[l];

						if (sum > target) {
							l--;
						} else if (sum < target) {
							k++;
						} else if (sum == target) {
							List<Integer> temp = new ArrayList<Integer>();
							temp.add(num[i]);
							temp.add(num[j]);
							temp.add(num[k]);
							temp.add(num[l]);

							if (!hashSet.contains(temp)) {
								hashSet.add(temp);
								result.add(temp);
							}

							k++;
							l--;
						}
					}
				}
			}
		}

		return result;
	}

}