public class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,sum=0,high=0;
        
        while(left<right){
        	if(height[left]<height[right]){
        		sum+=(high=Math.max(high,height[left]))-height[left];
        		left++;
        	}else{
        		sum+=(high=Math.max(high,height[right]))-height[right];
        		right--;
        	}
        	
        }
        return sum;
    }
}
