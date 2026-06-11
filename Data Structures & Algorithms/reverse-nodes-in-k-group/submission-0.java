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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode temp=head;
       while(temp!=null)
       {
        count++;
        temp=temp.next;
       }
       int reverse=count/k;
       
       ListNode curr=head;
       ListNode newhead=null;
       ListNode prevGroupTail=null;
       while(reverse!=0)
       {
        ListNode prev=null;
        ListNode groupTail=curr;
        int z=k;
       while(z!=0)
       {
        ListNode temp1=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp1;
        
        z--;
       }
       
       if(newhead==null)
       {
        newhead=prev;
       }
       if(prevGroupTail!=null)
       {
        prevGroupTail.next=prev;
       }
       groupTail.next=curr;
       prevGroupTail=groupTail;

       reverse--; 
      
       } 
       return newhead;
    }
    
}
