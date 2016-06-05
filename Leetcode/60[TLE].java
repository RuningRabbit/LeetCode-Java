
public class Solution {
	int K=0;
	String S="";
	boolean f=false;
	public String getPermutation(int n, int k) {
		int[] a = new int[n];
		boolean[] flag=new boolean[n+1];
		int sum=1;
		for(int i=1;i<n;i++)
			sum*=i;
		
		K=k%sum;
		DFS(0,n,flag,a);
		return S;
	}
	public void DFS(int x,int n,boolean[] flag,int[] a){
		if(f) return;
		if(x==n){			
			
			K--;
			if(K==0){
				f=true;
				for(int i=0;i<n;i++)
					S+=a[i];
			}
			return;
		}			
		for(int i=1;i<=n;i++){
			if(flag[i]) continue;
			flag[i]=true;
			a[x]=i;
			DFS(x+1,n,flag,a);
			flag[i]=false;
		}
	}

}
