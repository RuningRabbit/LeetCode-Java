import java.util.HashMap;

class TrieNode {
	char c;
	HashMap<Character, TrieNode> child = new HashMap<Character, TrieNode>();
	boolean hasword;

	public TrieNode() {

	}

	public TrieNode(char c) {
		this.c = c;
	}
}

public class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode cur;
		HashMap<Character, TrieNode> curChild = root.child;

		for (int i = 0; i < word.length(); i++) {
			char wc = word.charAt(i);
			if (curChild.containsKey(wc)) {
				cur = curChild.get(wc);
			} else {
				TrieNode newNode = new TrieNode(wc);
				curChild.put(wc, newNode);
				cur = newNode;
			}
			curChild = cur.child;
			if (i == word.length() - 1)
				cur.hasword = true;
		}
	}

	public boolean search(String word) {
		if (searchWordNodePos(word) == null)
			return false;
		else if (searchWordNodePos(word).hasword)
			return true;
		else
			return false;
	}

	public boolean startsWith(String prefix) {
		if (searchWordNodePos(prefix) == null)
			return false;
		else
			return true;
	}

	public TrieNode searchWordNodePos(String s) {
		TrieNode cur = null;
		HashMap<Character, TrieNode> curChild = root.child;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (curChild.containsKey(c)) {
				cur = curChild.get(c);
				curChild = cur.child;
			} else
				return null;
		}
		return cur;
	}
}

/*public class Solution{
	public static void main(String[] args){
		Trie trie = new Trie();
		trie.insert("somestring");
		System.out.println(trie.search("somestring"));
		System.out.println(trie.search("key"));
		trie.insert("key");
		System.out.println(trie.search("key"));
		System.out.println(trie.search("some"));
		System.out.println(trie.startsWith("some"));
	}
}*/
