public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] nums3 = new int[nums1.length + nums2.length];
		int i, j, k;
		i = j = k = 0;
		int len=nums3.length;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j])
				nums3[k++] = nums1[i++];

			else
				nums3[k++] = nums2[j++];
			
			if (len % 2 == 0 && i + j == len / 2 + 1)
				return (double) (nums3[len / 2] + nums3[len / 2 - 1]) / 2;
			else if (len % 2 != 0 && i + j == len / 2 + 1)
				return (double) nums3[len / 2];

		}

		while (i < nums1.length) {
			nums3[k++] = nums1[i++];
			if (len % 2 == 0 && i + j == len / 2 + 1)
				return (double) (nums3[len / 2] + nums3[len / 2 - 1]) / 2;
			else if (len % 2 != 0 && i + j == len / 2 + 1)
				return (double) nums3[len / 2];
		}
		while (j < nums2.length) {
			nums3[k++] = nums2[j++];
			if (len % 2 == 0 && i + j == len / 2 + 1)
				return (double) (nums3[len / 2] + nums3[len / 2 - 1]) / 2;
			else if (len % 2 != 0 && i + j == len / 2 + 1)
				return (double) nums3[len / 2];
		}

		if (len % 2 == 0)
			return (double) (nums3[len / 2] + nums3[len / 2 - 1]) / 2;
		else 
			return (double) nums3[len / 2];
	}
}
