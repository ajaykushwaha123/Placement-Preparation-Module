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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
         Stack<Integer> st2 = new Stack<>();
        ListNode list = new ListNode();
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while(temp1 != null){
            st1.push(temp1.val);
            temp1 = temp1.next;
        }
         while(temp2 != null){
            st2.push(temp2.val);
            temp2 = temp2.next;
        }
        int sum = 0;
        int carry = 0;
        while(!st1.isEmpty() || !st2.isEmpty()){
            if(!st1.isEmpty()){
                sum += st1.pop();
            }
            if(!st2.isEmpty()){
                sum += st2.pop();
            }
            list.val = sum % 10;
            carry = sum / 10;
            ListNode head = new ListNode(carry);
            head.next = list;
            list = head;
            sum = carry;
            
        }
        return carry == 0 ? list.next : list;
        
    }
}