/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n)  {
		if(head==null||head.next==null) return head;
		if(m==n)return head;
		ListNode pre=head;
		ListNode a=null;
		int i=1;
		while(pre!=null&&i!=m){
			a=pre;
			pre=pre.next;
			
			i++;
		}		
		ListNode T=new ListNode(0);		
		while(pre!=null&&i!=n+1){					
			ListNode c=T.next;			
			T.next=pre;
			pre=pre.next;
			T.next.next=c;
			i++;	
		}
		if(a!=null)
		a.next=T.next;
		else
		head=T.next;
		
		while(T.next!=null) T=T.next;
		T.next=pre;
		return head;
	}
}