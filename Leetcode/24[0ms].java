/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode l = new ListNode(0);
		ListNode L = l;
		while (head != null && head.next != null) {
		    ListNode end=head.next.next;
			L.next = head.next;
			L = L.next;
			L.next = head;
			L = L.next;
			
			head = end;
			L.next=null;
		}
		if (head != null)
			L.next= head;
		return l.next;
	}
}