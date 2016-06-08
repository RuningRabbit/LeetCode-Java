public class Solution {
    public int[] plusOne(int[] digits) {
		digits[digits.length-1]++;
		for(int i=digits.length-1;i>0;i--){
			digits[i-1]+=digits[i]/10;
			digits[i]%=10;
		}
		if(digits[0]<10) return digits;
		
		int[] newdigits=new int[digits.length+1];
		Arrays.fill(newdigits, 0);
		newdigits[0]=1;		
		return newdigits;
	}
}