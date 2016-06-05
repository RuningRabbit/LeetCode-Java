public class Solution {
     public String simplifyPath(String path) {
		Stack<String> s = new Stack<String>();
		int i = 0;
		while (i < path.length()) {
			if (i < path.length() && path.charAt(i) == '/')
				i++;
			StringBuffer sub = new StringBuffer("");
			while (i < path.length() && path.charAt(i) != '/') {
				sub.append(path.charAt(i));
				i++;
			}
			if (sub.toString().equals("..") && !s.empty())
				s.pop();
			else if (!sub.toString().equals("..") && !sub.toString().equals(".") && !sub.toString().equals("")) {
				s.push(sub.toString());
			}
		}

		if (s.empty())
			return "/";
		StringBuffer sub = new StringBuffer("");
		while (!s.empty()) {
			sub.insert(0, "/");
			sub.insert(1, s.peek());
			s.pop();
		}
		return sub.toString();
	}
}