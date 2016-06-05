public class Solution {
public int mySqrt(int x){
		double c= 10000;
		
		while(Math.abs(c*c-x)>1e-4){
			c=(c/2)+(x/(2*c));
		}
		return (int)c;
	
	}
}