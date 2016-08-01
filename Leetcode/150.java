public class Solution {
    public int evalRPN(String[] tokens) {
		Stack<Integer> S = new Stack<Integer>();
		for (int i = 0; i < tokens.length; i++) {
			if (Character.isDigit(tokens[i].charAt(tokens[i].length()-1))) {
				S.push(Integer.valueOf(tokens[i]));
			} else if (tokens[i].equals("+")) {
				int a = S.pop();
				int b = S.pop();
				S.push(b + a);
			} else if (tokens[i].equals("-")) {
				int a = S.pop();
				int b = S.pop();
				S.push(b - a);
			} else if (tokens[i].equals("*")) {
				int a = S.pop();
				int b = S.pop();
				S.push(b * a);
			} else if (tokens[i].equals("/")) {
				int a = S.pop();
				int b = S.pop();
				S.push(b / a);
			}
		}
		return S.peek();
	}
}
