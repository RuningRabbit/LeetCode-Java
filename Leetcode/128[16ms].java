import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> S=new HashSet<Integer>(); 
       int max=1;
       
       for(int e:nums)
    	   S.add(e);
       
       for(int e:nums){
    	   int left=e-1;
    	   int right=e+1;
    	   int count=1;
    	   while(S.contains(left)){
    		   count++;
    		   S.remove(left);
    		   left--;
    	   }
    	   while(S.contains(right)){
    		   count++;
    		   S.remove(right);
    		   right++;
    	   }
    	   max=Math.max(max, count);
       }
       return max;
    }
}
