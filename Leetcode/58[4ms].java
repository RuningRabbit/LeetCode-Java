public class Solution {
    public int lengthOfLastWord(String s) {
	        s=s.trim();
	    	String[] S=s.split(" ");
	        return S[S.length-1].length();
	    }
	
	
}