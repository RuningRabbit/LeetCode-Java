import java.util.*;

public class Solution {

	List<String> L = new ArrayList<String>();
	int[] flag = new int[2];

	public List<String> generateParenthesis(int n) {
		flag[0] = n;
		flag[1] = n;
		DFS(0, "", 2 * n);
		return L;
	}

	public void DFS(int x, String s, int n) {
		
		//
		// if(flag[0]>flag[1])return;
		//
		//
		// time: 2ms

		if (x == n&&isValid(s)) {
			L.add(s);
			return;
		}
		String k = "()";
		for (int i = 0; i < k.length(); i++) {
			if (flag[i] == 0)continue;
			String add = s;
			flag[i]--;
			s += k.charAt(i);
			DFS(x + 1, s, n);
			flag[i]++;
			s = add;
		}

	}

	/*public boolean isValid(String s) {
		Stack<Character> S = new Stack<Character>();
		int i = 0;
		while (i < s.length()) {
			if (!S.empty() && S.peek() == '(' && s.charAt(i) == ')')
				S.pop();
			else
				S.push(s.charAt(i));
			i++;
		}

		if (S.empty())
			return true;
		else
			return false;
	}*/

}