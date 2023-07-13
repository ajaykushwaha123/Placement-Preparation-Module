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
    public boolean isPalindrome(ListNode head) {
//          if(head == null || head.next == null){
//             return true;
//          }
//         ListNode slow = head;
//         ListNode fast = head;
//         if(fast.next != null && fast.next.next != null){
//             fast = fast.next.next;
//              slow = slow.next;
//         }
//         if(fast != null) slow = slow.next; 
//        ListNode newHead = reverse(slow);
        
//         while( newHead != null){
//             if(newHead.val != head.val)
//                  return false;
//             else{
//             newHead = newHead.next;
//              head = head.next;   
//         }
//         }
//         return true;
//     }
//      public ListNode reverse(ListNode head){
//         ListNode cur=head,prev=null;
//         while(cur!=null){
//             ListNode temp=cur.next;
//             cur.next=prev;
//             prev=cur;
//             cur=temp;
//         }
//         return prev;
         if(head.next == null){
            return true;
        }
        
        ListNode middleNode = getMiddleNode(head);
        ListNode head1 = head;
        ListNode head2 = middleNode.next; 
        middleNode.next = null; 
        head2 = reverseLinkedList(head2); 

        while(head1!=null && head2!=null){
            if(head1.val != head2.val){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return true;
    }

    public ListNode getMiddleNode(ListNode node){
        ListNode slow = node;
        ListNode fast = node.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseLinkedList(ListNode node){
        if(node==null || node.next == null){
            return node;
        }

        ListNode newHead = reverseLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }
}