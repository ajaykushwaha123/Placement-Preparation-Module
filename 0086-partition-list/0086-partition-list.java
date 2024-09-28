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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode s = small;
        ListNode greater = new ListNode(-1);
        ListNode g = greater;
        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                s.next = curr;
                s = s.next;
            }
            else{
                g.next = curr;
                g = g.next;
            }
            curr = curr.next;
        }
        s.next = greater.next;
        g.next = null;
        return small.next;
    }
}