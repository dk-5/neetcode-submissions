class WordDictionary {
     Node root;
    public WordDictionary() {
     root= new Node();
    }

    public void addWord(String word) 
    {
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
      
    return dfs(0,root,word);
    }
    public boolean dfs(int j,Node root,String word)
    {

        Node curr=root;
        for(int i=j;i<word.length();i++)
        {
            if(word.charAt(i)=='.')
            {
                for(Node c:curr.children)
                {
                    if(c!=null && dfs(i+1,c,word))
                    {
                        return true;
                    }
                    
                }
                return false;
            }
            else 
            {
                int idx=word.charAt(i)-'a';
                if(curr.children[idx]==null)
                {
                    return false;
                }
                curr=curr.children[idx];
            }
        }
        return curr.eow;
    }
}

class Node 
{
    Node[]children;
    boolean eow;
    Node()
    {
     children=new Node[26];
     for(int i=0;i<children.length;i++)
    {
        children[i]=null;
    }
     eow=false;
    }
    
    
}