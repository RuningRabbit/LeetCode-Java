public class Solution {
    public int reverse(int x) {
        long a=0;
		while(x!=0){		
			a=a*10+x%10;
			x/=10;
			if(a>0x7fffffff) return 0;
			if(a<-0x80000000) return 0;
		}
		return (int)a;
    }
}
