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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      int count=0;
      ListNode temp=head;
      while(temp!=null)
      {
       count++;
       temp=temp.next;
      }
      temp=head;
      n=count-n;
      ListNode prev=null;
      if(n==0)
      {
        if(head.next==null)
        {
            return prev;
        }
        else 
        {
        head=head.next;
        return head;
        }
        
      }
      while(n!=0)
      {
        prev=temp;
        temp=temp.next;
        n--;
      }
       prev.next=temp.next;
       return head;

    }
}
