class Solution {
    Map<Integer,String> d;
    List<String> res;
    public List<String> letterCombinations(String digits) {
        d=new HashMap<>();
        d.put(2,"abc");
        d.put(3,"def");
        d.put(4,"ghi");
        d.put(5,"jkl");
        d.put(6,"mno");
        d.put(7,"pqrs");
        d.put(8,"tuv");
        d.put(9,"wxyz");
        res= new ArrayList<>();
        if(digits.equals("")) return res;
        generate(digits,0,"");
        return res;

    }
    public void generate(String digits,int i,String c)
    {
    if(digits.length()==c.length())
    {
        res.add(c);
        return;
    }
    String w=d.get(digits.charAt(i)-'0');
    for(char s: w.toCharArray())
    {
        generate(digits,i+1,c+s);
    }

    }
}
