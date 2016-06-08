public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> L = new ArrayList<List<Integer>>();

		if (numRows == 0)
			return L;
		for (int i = 0; i <numRows; i++) {
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
		}
		return L;
	}
	//public static void main(String[] args){
	//	Solution s=new Solution();
	//	System.out.println(s.generate(7));
	//}
}