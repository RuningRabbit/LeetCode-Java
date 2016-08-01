/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		return mergeSort(head);
	}

	public ListNode mergeSort(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode p = head, q = head, pre = null;
		while (q != null && q.next != null) {
			q = q.next.next;
			pre = p;
			p = p.next;
		}
		pre.next = null;
		ListNode left = mergeSort(head);
		ListNode right = mergeSort(p);
		return merge(left, right);
	}

	public ListNode merge(ListNode left, ListNode right) {
		ListNode temp = new ListNode(0);
		ListNode p = temp;
		while (left != null && right != null) {
			if (left.val < right.val) {
				p.next = left;
				left = left.next;
			} else {
				p.next = right;
				right = right.next;
			}
			p = p.next;
		}
		if (left != null)
			p.next = left;
		else
			p.next=right;
		p=temp.next;
		temp.next=null;
		return p;
	}

}

