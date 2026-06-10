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
    public ListNode mergeKLists(ListNode[] lists) {
     PriorityQueue<ListNode> node= new PriorityQueue<>((a,b)->a.val-b.val);
     for(ListNode n:lists)
     {
        node.offer(n);
     }
     ListNode a = new ListNode(-1);
     ListNode curr=a;
     while(!node.isEmpty())
     {
      ListNode z=node.poll();
      curr.next=z;
      curr=curr.next;
      if(z.next!=null)
      {
       node.offer(z.next);
      }

      
     }
     return a.next;
     
    }
}
