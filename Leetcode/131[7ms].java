public class Solution {
     public List<List<String>> partition(String s) {
    	List<List<String>> L=new ArrayList<List<String>>();
    	List<String> x=new ArrayList<String>();
    	dfs(s,0,L,x);
    	return L;   	
    }
    
    private void dfs(String s,int start,List<List<String>> L,List<String> x){
    	if(start==s.length()){
    		List<String> tem=new ArrayList<String>(x);
    		L.add(tem);
    		return;
    	}
    	
    	for(int i=start+1;i<=s.length();i++){
    		String str=s.substring(start,i);
    		if(isPalin(str)){
    			x.add(str);
    			dfs(s,i,L,x);
    			x.remove(x.size()-1);
    		}
    	}
    }
    private boolean isPalin(String s){
    	for(int i=0,j=s.length()-1;i<=j;i++,j--){
    		if(s.charAt(i)!=s.charAt(j))return false;
    	}
    	return true;
    }
}