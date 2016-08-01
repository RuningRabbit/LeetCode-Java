import java.util.Stack;

public class Solution {
	public int calculate(String s) {
		return evalPRN(toPolish(s));
	}

	private int cmp(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		default:
			return 0;
		}
	}

	public String toPolish(String s) {
		Stack<Character> S = new Stack<Character>();
		String ex = "";
		int i = 0;
		while (i < s.length()) {
			char ch = s.charAt(i);
			switch (ch) {
			case '(':
				S.push(ch);
				break;

			case ')':
				while (S.peek() != '(') {
					ex += S.peek();
					S.pop();
				}
				S.pop();
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				while (!S.empty() && cmp(S.peek()) >= cmp(ch)) {
					ex += S.peek();
					S.pop();
				}
				S.push(ch);
				break;
			default:
				if (Character.isDigit(ch)) {
					while (i < s.length() && Character.isDigit(ch)) {
						ex += ch;
						i++;
						if (i < s.length())
							ch = s.charAt(i);
					}
					i--;
					ex += ' ';
				}
				break;
			}
			i++;
		}
		while (!S.empty()) {
			ex += S.peek();
			S.pop();
		}

		return ex;
	}

	public int evalPRN(String s) {
		Stack<Integer> S = new Stack<Integer>();
		int i = 0;
		while (i < s.length()) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				String ss = "";
				while (i < s.length() && Character.isDigit(ch)) {
					ss += ch;
					i++;
					if (i < s.length())
						ch = s.charAt(i);
				}
				S.push(Integer.parseInt(ss));
			} else if (ch == '+') {
				int a = S.pop();
				int b = S.pop();
				S.push(b + a);
			} else if (ch == '-') {
				int a = S.pop();
				int b = S.pop();
				S.push(b - a);
			} else if (ch == '*') {
				int a = S.pop();
				int b = S.pop();
				S.push(b * a);
			} else if (ch == '/') {
				int a = S.pop();
				int b = S.pop();
				S.push(b / a);
			}
			i++;
		}
		return S.peek();
	}

}
