/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null||head.next==null) return head;
		ListNode p=head;
		ListNode q=head.next;
		
		while(q!=null){
			if(p.val==q.val){
				q=q.next;
				p.next=q;
			}
			else{
				q=q.next;
				p=p.next;
			}
			
		}
		return head;
	}
}