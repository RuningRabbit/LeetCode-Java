public class Solution {
   public List<String> restoreIpAddresses(String s) {
		List<String> L = new ArrayList<String>();
		List<String> Total = new ArrayList<String>();
		if(s.length()>12) return Total;
		DFS(0, 0, s, L, Total);
		return Total;
	}

	public void DFS(int l, int x, String s, List<String> L, List<String> Total) {
		if(x<4&& (s.length()-l)>3*(4-x)) return;
		if (x == 4 && l == s.length()) {
			boolean flag = false;
			for (String each : L) {
				if(each.length()>=2&&each.charAt(0)=='0')return;
				int a = Integer.parseInt(each);
				if (a > 255)
					flag = true;
			}
			if (flag)
				return;
			Total.add(L.get(0) + "." + L.get(1) + "." + L.get(2) + "." + L.get(3));
			return;
		}
		for (int i = 1; i < 4; i++) {
			if (l + i > s.length())
				continue;
			L.add(s.substring(l, l + i));
			DFS(l + i, x + 1, s, L, Total);
			L.remove(L.size() - 1);
		}
	}

}