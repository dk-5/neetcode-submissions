/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
    Map<Node,Node> m= new HashMap<>();
    m.put(null,null);
    Node temp=head;
    while(temp!=null)
    {
        Node a=new Node(temp.val);
        m.put(temp,a);
        temp=temp.next;
    }
    temp=head;
    while(temp!=null)
    {
        Node a = m.get(temp);
        a.next=m.get(temp.next);
        a.random=m.get(temp.random);
        temp=temp.next;
    }
    return m.get(head);
    }
}
