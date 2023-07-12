/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr = headA;
        int a= 0, b =0;
        while(curr.next!=null){
            a++;
            curr = curr.next;
        }
        curr = headB;
            while(curr.next!=null){
                b++;
                curr= curr.next;
            }
       while(a > b){
           a--;
           headA = headA.next;
       }
        while(b>a){
            b--;
            headB = headB.next;
        }
        while(headA != headB){
          headA = headA.next;
          headB = headB.next;
        }
        return headA;
    }
}