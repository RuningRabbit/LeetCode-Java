
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        if(head.next==null) return null;
        ListNode a=head;
        ListNode b=head;
        int i=0;
        
        while(i<n){
        	i++;
        	a=a.next;
        }
        if(a==null){
        	head=head.next;
        	return head;
        }
        while(a.next!=null){
        	a=a.next;
        	b=b.next;
        }        
        b.next=b.next.next;
           
        return head;
    }
}