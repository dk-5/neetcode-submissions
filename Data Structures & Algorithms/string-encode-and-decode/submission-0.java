class Solution {

    public String encode(List<String> strs) {
      if(strs.isEmpty()) return "";
      StringBuilder res= new StringBuilder();
      List<Integer> size= new ArrayList<>();
      for(String s:strs)
      {
        size.add(s.length());

      }
      for(int su:size)
      {
        res.append(su).append(",");
      }
      res.append("#");
      for(String s2:strs)
      {
       res.append(s2);
      }
      return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        if(str.length()==0) return new ArrayList<>();
        List<Integer> size= new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#')
        {
            StringBuilder cur= new StringBuilder();
            while(str.charAt(i)!=',')
            {
               cur.append(str.charAt(i));
               i++;
            }
            size.add(Integer.parseInt(cur.toString()));
            i++;

        }
        i++;
        for(int s: size)
        {
            res.add(str.substring(i,i+s));
            i=i+s;
        }
        return res;


    }
}
