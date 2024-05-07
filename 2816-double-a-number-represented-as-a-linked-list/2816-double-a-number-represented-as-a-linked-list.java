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
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> values=new Stack<>();
        int val=0;
        while(head!=null){
            values.push(head.val);
            head=head.next;
        }
        ListNode newtail=null;

        while(!values.isEmpty()||val!=0){
            newtail=new ListNode(0,newtail);

            if(!values.isEmpty()){
                val+=values.pop()*2;
            } 
            newtail.val=val%10;
            val/=10;
        }
        return newtail;
    }
}