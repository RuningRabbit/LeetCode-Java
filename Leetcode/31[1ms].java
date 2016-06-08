public class Solution {
     public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while(i>0&&nums[i-1]>=nums[i]){
        	i--;
        }
        
        int j=nums.length-1;
        if(i!=0){
        	while(nums[j]<=nums[i-1]) j--;
        	int a=nums[j];
        	nums[j]=nums[i-1];
        	nums[i-1]=a;
        	
        }
 
        for(j=nums.length-1;i<=j;j--,i++){
        	int a=nums[j];
        	nums[j]=nums[i];
        	nums[i]=a;
        }
     
    }

}