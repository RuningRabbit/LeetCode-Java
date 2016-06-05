/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
   public ListNode rotateRight(ListNode head, int k) {
		if(head==null||head.next==null) return head;
		ListNode a=head;
		int sum=1;
		while(a.next!=null){
			a=a.next;
			sum++;
		}
		
		a.next=head;
		k=k%sum;
		int b=sum-k;
		while(b!=1){
			head=head.next;
			b--;
		}
		ListNode c=head.next;
		head.next=null;
		return c;
	}
}