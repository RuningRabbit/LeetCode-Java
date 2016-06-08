public class Solution {
   public String convert(String s, int numRows) {
    	if(numRows==1) return s;
    	int len=s.length();
    	StringBuffer res = new StringBuffer("");        
        for(int i=1;i<=numRows;i++){
        	int m=(numRows-1)*2;
        	if(i==1||i==numRows){
        		int j=i;
        		while(j<=len){
        			res.append(s.charAt(j-1));
        			j+=m;
        		}
        	}else{
        		int j=i;
        		int k=0;
        		int l=j;
        		while(j<=len){
        			res.append(s.charAt(j-1));
        			j=2*numRows+k*m-l;
        			k++;
        			l=j;
        		}
        	}
        	
        	
        }
        return res.toString();
    }
}
