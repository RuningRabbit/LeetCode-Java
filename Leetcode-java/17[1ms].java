import java.util.*;
public class Solution {
	public static String[] res={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static String s;
	public List<String> letterCombinations(String digits) {
		List<String> a=new ArrayList<>();
		if(digits.length()==0) return a;
		s=digits;
        dfs(0,"",a);
        return a;
    }
    
    public static void dfs(int x,String add,List<String> a){    	
    	if(x==s.length()){
    		a.add(add);
    		return;
    	}
    	
    	for(int i=0;i<res[(int)(s.charAt(x)-'0')].length();i++){
    		String str=add;
    		add+=res[(int)(s.charAt(x)-'0')].charAt(i);
    		dfs(x+1,add,a);
    		add=str;
    	}
    }
}