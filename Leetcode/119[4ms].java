public class Solution {
    public  List<Integer> getRow(int rowIndex) {
		List<List<Integer>> L = new ArrayList<List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i <=rowIndex; i++) {
			List<Integer> x = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {

				if (j == 0 || j == i)
					x.add(1);
				else {
					int a = L.get(L.size() - 1).get(j);
					int b = L.get(L.size() - 1).get(j - 1);
					x.add(a + b);
				}
			}			
			L.add(x);
			l=x;
		}
		return l;
	}
    
}