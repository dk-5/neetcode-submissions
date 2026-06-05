class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       res=new ArrayList<>();
       Arrays.sort(candidates);
       combinationSum(new ArrayList<>(),candidates,target,0); 
       return res;
    }
    void combinationSum(List<Integer> a,int[] candidates,int target,int i)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(a));
            return;
        }
        if(target<0 || i>=candidates.length)
        {
            return;
        }
        a.add(candidates[i]);
        combinationSum(a,candidates,target-candidates[i],i+1);
        a.remove(a.size()-1);
        while(i+1<candidates.length && candidates[i]==candidates[i+1])
        {
            i++;
        }
        combinationSum(a,candidates,target,i+1);
    }
}
