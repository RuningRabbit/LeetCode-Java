public class Solution {
    public String addBinary(String a, String b) {
		int m = a.length();
		int n = b.length();
		StringBuffer c = new StringBuffer("");

		for (int i = m - 1, j = n - 1; i >= 0 || j >= 0; i--, j--) {
			if (i >= 0 && j >= 0)
				c.insert(0, (int) (a.charAt(i) - '0') + (int) (b.charAt(j) - '0'));
			else if (i >= 0 && j < 0)
				c.insert(0, (int) (a.charAt(i) - '0') + 0);
			else if (i < 0 && j >= 0)
				c.insert(0, 0 + (int) (b.charAt(j) - '0'));
		}
		
		for(int i=c.length()-1;i>0;i--)
		{
			int p=(int)(c.charAt(i)-'0')%2;
			int q=(int)(c.charAt(i-1)-'0')+(int)(c.charAt(i)-'0')/2;
			c.setCharAt(i,(char)(p+'0'));
			c.setCharAt(i-1,(char)(q+'0'));
			
		}
		int p=(int)(c.charAt(0)-'0');
		c.setCharAt(0,(char)(p%2+'0'));
		if(p>1)
			c.insert(0,'1');
		
		
		return c.toString();
	}
}