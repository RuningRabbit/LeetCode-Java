/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode partition(ListNode head, int x) {
		ListNode less = new ListNode(0);
		ListNode more = new ListNode(0);
		ListNode a=less;
		ListNode b=more;
		while(head!=null){
			if(head.val<x){
				a.next=head;
				head=head.next;
				a=a.next;
			}else{
				b.next=head;
				head=head.next;
				b=b.next;
			}
		}
		b.next=null;
		a.next=more.next;
		return less.next;
		
	}
}