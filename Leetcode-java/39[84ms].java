public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> L=new ArrayList<List<Integer>>();
		List<Integer> ad=new ArrayList<Integer>();
		Set<List<Integer>> S=new HashSet<List<Integer>>();
	   // boolean[] flag=new boolean[target+1];
		DFS(S,ad,target,candidates);
		L.clear();
		L.addAll(S);
		return L;
	}
	
	public void DFS(Set<List<Integer>> S,List<Integer> ad,int target,int[] candidates){
		if(0==target){
			
			List<Integer> c=new ArrayList<Integer>(ad);
			Collections.sort(c);
			S.add(c);		
		}
		
		for(int i=0;i<candidates.length;i++){
			if(target<candidates[i]){
				return;
			}
			//if(flag[i])continue;
			//flag[i]=true;
			ad.add(candidates[i]);
			DFS(S,ad,target-candidates[i],candidates);
			//flag[i]=false;
			ad.remove(ad.size()-1);
		}
	}

}