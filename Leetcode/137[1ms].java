public class Solution {
    //時間復雜度O(32N)
	public int singleNumber(int[] nums) {
		int res=0;
		for(int i=0;i<32;i++){
			int w=0;
			for(int j=0;j<nums.length;j++)
				w+=(nums[j]>>i)&1;
			res=res|((w%3)<<i);
		}
		return res;
	}
}