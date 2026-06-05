class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
        s.add(nums[i]);
        }
        int longest=0;
        for(int num:s)
        {
            if(!s.contains(num-1))
            {
                int length=1;
                while(s.contains(num+length))
                {
                    length++;
                }
             longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}
