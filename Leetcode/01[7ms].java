import java.util.*;


public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] res=new int[2];
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
			m.put(new Integer(nums[i]),new Integer(i));
		
		for(int i=0;i<nums.length;i++){
			if(m.get((target-nums[i]))!=null&&m.get(target-nums[i])!=i){
				res[0]=i;
				res[1]=m.get(target-nums[i]);
				break;
			}
		}
		return res;
	}
}

