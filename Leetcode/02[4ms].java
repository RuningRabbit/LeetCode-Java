/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode h=res;
        int sum=0;
        while(l1!=null||l2!=null){
        	if(l1!=null){
        		sum+=l1.val;
        		l1=l1.next;
        	}
        	if(l2!=null){
        		sum+=l2.val;
        		l2=l2.next;
        	}
        	h.next=new ListNode(sum%10);
        	sum=sum/10;
        	h=h.next;
        }
        if(sum==1){
        	h.next=new ListNode(1);
        } 
        return res.next;
    }
}
