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
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode node = head;
        while(node.next != null){
            int num = node.val;
            node.val = node.next.val;
            node.next.val = num;
            if(node.next.next != null){
                node = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }
}