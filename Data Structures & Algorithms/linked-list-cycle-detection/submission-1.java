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
    public boolean hasCycle(ListNode head) {
        ListNode l1=head;
       while(l1!=null)
       {
         l1.val=-1;
         l1=l1.next;
        if(l1 != null && l1.val == -1)
        {
           return true;
        }
       }
       return false; 
    }
}
