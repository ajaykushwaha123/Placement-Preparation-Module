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
    public ListNode rotateRight(ListNode head, int k) {
          ListNode temp = head, prev = head, curr = head;

        if(head == null || head.next == null) return head;
        int size = 0, i = 1;
        
        while(temp != null) {
            size++;
            temp = temp.next;
        }

        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;

        k %= size;
        while(i < (size - k)) {
            prev = prev.next;
            i++;
        }

        ListNode res = prev.next;
        prev.next = null;

        return res;
    }
}