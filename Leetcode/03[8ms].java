import java.util.Arrays;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxn=0;
        int i=0;
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        for(int j=0;j<s.length();j++){
        	
        	if(hash[(int)s.charAt(j)]!=-1&&hash[(int)s.charAt(j)]>=i){
        		maxn=Math.max(maxn, j-i);
        		i=hash[(int)s.charAt(j)]+1;       		
        	}  	
        	hash[(int)s.charAt(j)]=j; 
        }
        
        maxn=Math.max(s.length()-i,maxn);
    	return maxn;
    }
    
}
