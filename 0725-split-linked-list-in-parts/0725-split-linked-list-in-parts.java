/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        if(head == null) return result;

        int len = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            len++;
        }

        int div = len / k;
        int mod = len % k;
        int interval = div + 1;
        int ind = 0;
        curr = head;
        ListNode prev = null;
        
        for(int i = 0; i < mod; i++) {
            result[ind++] = curr;
            for(int j = 0; j < interval; j++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }

        if(curr != null)

        while(curr != null) {
            result[ind++] = curr;
            for(int j = 0; j < interval - 1; j++) {
                if(curr == null) break;
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }
        return result;
    }
}