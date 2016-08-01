/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode reverseList(ListNode head) {
		if(head==null||head.next==null) return head;
		ListNode T=new ListNode(0);
		while(head!=null){
			ListNode c=T.next;			
			T.next=head;
			head=head.next;
			T.next.next=c;
		}
		return T.next;
	}
}