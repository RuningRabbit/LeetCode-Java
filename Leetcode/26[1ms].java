import java.util.*;

public class Solution {
	public int removeDuplicates(int[] nums) {
		QuickSort(nums,0,nums.length-1);
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1])
				continue;
			else
				count++;
		}
		return count;
	}

	public static void QuickSort(int[] nums, int l, int r) {
		if (l < r) {
			int x = nums[l], i = l, j = r;
			while (i < j) {
				while (i < j && nums[j] >= x)
					j--;
				if (i < j)
					nums[i++] = nums[j];
				while (i < j && nums[i] < x)
					i++;
				if (i < j)
					nums[j--] = nums[i];
			}
			nums[i] = x;
			QuickSort(nums, l, i - 1);
			QuickSort(nums, i + 1, r);
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 2, 1, 2 };
		System.out.println(s.removeDuplicates(nums));
	}
}