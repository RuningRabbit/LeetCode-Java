class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public void reorderList(ListNode head) {
		if (head == null)
			return;
		
		ListNode L = head;
		ListNode N = null;

		while (L.next != null) {
			N = L;
			if (N.next.next == null)
				break;
			while (N.next.next != null)
				N = N.next;

			ListNode Q = N.next;
			N.next = null;
			ListNode P = L.next;
			L.next = Q;
			Q.next = P;
			L = P;
		}
	}

}