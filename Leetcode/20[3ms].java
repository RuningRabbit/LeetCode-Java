import java.util.*;

public class Solution {
	public boolean isValid(String s) {
		Stack<Character> S = new Stack<Character>();
		Map<Character, Character> m = new HashMap<>();
		m.put('(', ')');
		m.put('[', ']');
		m.put('{', '}');
		int i = 0;
		while (i < s.length()) {

			if (!S.empty() &&m.get(S.peek())!=null &&m.get(S.peek())==s.charAt(i))
				S.pop();
			else
				S.push(s.charAt(i));
			i++;
		}

		if (S.empty())
			return true;
		else
			return false;
	}

}