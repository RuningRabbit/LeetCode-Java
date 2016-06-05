public class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        
        String say="1";
        for(int i=2;i<=n;i++){
        	say=SAY(say);       	
        }
        return say;
    }
    
    public String SAY(String say){
    	char ch=say.charAt(0);
    	StringBuffer re=new StringBuffer("");
    	int i=0;
    	while(i<say.length()){
    		int num=0;
    		
    		while(i<say.length()&&say.charAt(i)==ch)
    		{
    		num++;
    		i++;  
    		}
    		
    		re.append((char)(num+'0'));
    		re.append(ch);
    		if(i<say.length()){
    		ch=say.charAt(i);		
    		}
    	}
    	return re.toString();
    }

}