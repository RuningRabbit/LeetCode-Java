public class Solution {
	public static ListNode reverseKGroup(ListNode head, int k) {
		if (k <= 1)
			return head; //如果K小于1不用操作
		
		int init = k,count=0;  //保存k的值，count是总数
		ListNode bianli=head;
		while(bianli!=null){
			count++;
			bianli=bianli.next;
		}	
		if(count<init) return head;  //如果总数小于k，直接返回
		
		
		ListNode L = new ListNode(-1);		
		ListNode P = L; 
		ListNode sb = null; //建立哨兵 记录L最后一个位置

		
		boolean flag = false;
		while (head != null) {
			ListNode N = head;  //取head节点
			head = head.next;
			N.next = null;
			
			ListNode T = P.next;
			P.next = N;
			N.next = T;
			
			if (flag == false) {  //记录哨兵
				sb = N;
				flag = true;

			}
			
			k--;
			
			if (k == 0) {
				count-=init;
				if(count<init){  
					sb.next=head;   //看看剩下的是否小于K值
					break;
				}
				
				P = sb;           //返回哨兵值
				flag = false;    //重新定义哨兵
				k = init;
				
			}

		}
			return L.next;
	}

}

