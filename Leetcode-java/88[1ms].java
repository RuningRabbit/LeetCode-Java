public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m;i<m+n;j++,i++){
        	nums1[i]=nums2[j];
        }
        Quick(nums1,0,m+n-1);
    }
    public void Quick(int[] nums,int l,int r){
    	if(l<r){
    		int x=nums[l],i=l,j=r;
    		while(i<j){
    			while(i<j&&nums[j]>=x) j--;
    			if(i<j) nums[i++]=nums[j];
    			while(i<j&&nums[i]<x) i++;
    			if(i<j) nums[j--]=nums[i];
    		}
    		nums[i]=x;
    		Quick(nums,l,i-1);
    		Quick(nums,i+1,r);
    	}
    }
}