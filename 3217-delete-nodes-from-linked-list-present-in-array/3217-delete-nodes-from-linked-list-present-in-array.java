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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> value = new HashSet<>();
        for(int num : nums){
            value.add(num);
        }
        while(head != null && value.contains(head.val)){
            head = head.next;
        }
        if(head == null){
            return null;
        }
        ListNode curr  = head;
        while(curr.next != null){
            if(value.contains(curr.next.val)){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
}