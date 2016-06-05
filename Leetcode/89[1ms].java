public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> L=new ArrayList<Integer>();
        int size=1<<n;
        for(int i=0;i<size;i++){
        	L.add((i>>1)^i);
        }
        return L;
    }
}