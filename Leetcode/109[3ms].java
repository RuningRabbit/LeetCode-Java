/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> L=new ArrayList<Integer>();
        while(head!=null){          
            L.add(head.val);
            head=head.next;
        }
        
        return DFS(L, 0, L.size()-1);
    }

    private TreeNode DFS(List<Integer> L, int start, int end) {
        if (start > end)
            return null;
        if (start == end) {
            return new TreeNode(L.get(start));
        } else {
            int mid = (start + end) / 2;
            TreeNode node = new TreeNode(L.get(mid));
            node.left = DFS(L, start, mid - 1);
            node.right = DFS(L, mid + 1, end);
            return node;
        }
    }
}
