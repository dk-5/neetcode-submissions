class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            h1.put(nums[i],i);
        }
        int i=0;
        while(i<nums.length)
        {
            int diff=target-nums[i];
            if(h1.containsKey(diff) && h1.get(diff)!=i)
            {
                return new int[]{i,h1.get(diff)};
            }
            i++;
        }
        return new int[0];
    }
}
