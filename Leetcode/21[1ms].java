public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a=l1;
        ListNode b=l2;
        ListNode c=new ListNode(0);
        ListNode head=c;
    	while(a!=null&&b!=null){
    		if(a.val<=b.val){
    			head.next=a;
    			a=a.next;
    		}
    		else{
    			head.next=b;
    			b=b.next;
    		}
    		head=head.next;
    			
    	}
    	if(a!=null){
    		head.next=a;
    	}
    	if(b!=null){
    		head.next=b;
    	}
    	return c.next;
    }
}