class PrefixTree {
      Node root;
    public PrefixTree() {
         root=new Node();
    }

    public void insert(String word) {
        Node curr=root;
    for(int i=0;i<word.length();i++)
    {
        int idx=word.charAt(i)-'a';
        if(curr.children[idx]==null)
        {
            curr.children[idx]=new Node();
        }
        if(i==word.length()-1)
        {
            curr.children[idx].eow=true;
        }
        curr=curr.children[idx];
    }
    }

    public boolean search(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                return false;
            }
            curr=curr.children[idx];
            

        }
        return curr.eow;
    }

    public boolean startsWith(String prefix) {
        Node curr=root;
      for(int i=0;i<prefix.length();i++)
        {
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                return false;
            }
            curr=curr.children[idx];

        }
        return true;
    }
}
class Node{
    Node[] children;
    boolean eow;
    Node(){
      children= new Node[26];
      for(int i=0;i<children.length;i++)
    {
        children[i]=null;
    }
      eow=false;
    }
    

}
