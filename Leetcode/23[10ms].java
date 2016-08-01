/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    	List<ListNode> L=Arrays.asList(lists);
    	return mergeKLists2(L);
    }
    
    public ListNode mergeKLists2(List<ListNode> lists){
    	if(lists==null||lists.size()==0)return null;
    	if(lists.size()==1)return lists.get(0);
    	 
    	int mid=lists.size()/2;
    	
    	
    	ListNode l1=mergeKLists2(lists.subList(0,mid));
    	ListNode l2=mergeKLists2(lists.subList(mid,lists.size()));
    	return merge(l1,l2);
    }
    
    public ListNode merge(ListNode a,ListNode b){
    	
    	ListNode c=new ListNode(0);
    	ListNode p=c;
    	while(a!=null&&b!=null){
    		if(a.val<b.val){
    			p.next=a;
    			a=a.next;
    		}
    		else{
    			p.next=b;
    			b=b.next;
    		}
    		p=p.next;
    	}
    	
    	if(a!=null)
    		p.next=a;
    	else
    		p.next=b;
    	
    	return c.next;
    }
}
