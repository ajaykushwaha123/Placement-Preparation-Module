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
    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        ListNode temp = head.next;
        while(temp != null){
            deque.offer(temp);
            temp = temp.next;
        }
        temp = head;
        while(!deque.isEmpty()){
            temp.next = deque.pollLast();
            temp = temp.next;
            if(!deque.isEmpty()){
                temp.next = deque.pollFirst();
                temp = temp.next;
            }
        }
        temp.next = null;
    }
}