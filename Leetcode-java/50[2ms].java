public class Solution {
    	public double myPow(double x, int n) {
		boolean flag=false;
		if(n<=0)flag=true;
		long t=Math.abs((long)n);
		double res=1;
		while(t!=0){
			if((t&1)==1)
			{
				if(flag)res*=(1/x);
				if(!flag) res*=x;
			}
			x*=x;
			t=t>>1;			
		}
		return res;
	}

}