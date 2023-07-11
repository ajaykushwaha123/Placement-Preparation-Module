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
    public ListNode removeElements(ListNode head, int val) {
        // if(head == null){
        //     return head;
        // }
        ListNode temp = new ListNode(-1,head);
        ListNode curr = temp;
        
       while(curr.next != null){
        if(curr.next.val == val){
            curr.next = curr.next.next;
        }
        else{
            curr = curr.next;
        }
       }
        return temp.next;
    }
}
// ListNode dummy = new ListNode(-1, head);
//         ListNode pre = dummy;
//         while (pre.next != null) {
//             if (pre.next.val != val)
//                 pre = pre.next;
//             else
//                 pre.next = pre.next.next;
//         }
//         return dummy.next;