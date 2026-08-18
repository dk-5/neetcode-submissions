class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       if(hand.length % groupSize !=0) return false;
       Arrays.sort(hand);
       Map<Integer,Integer> a = new HashMap<>();
       for(int i=0;i<hand.length;i++)
       {
        a.put(hand[i],a.getOrDefault(hand[i],0)+1);
       }
       for(int i=0;i<hand.length;i++)
       {
        if(a.get(hand[i])>0)
        {
            for(int j=hand[i];j<hand[i]+groupSize;j++)
            {
                if(a.getOrDefault(j,0)==0) return false;
                a.put(j,a.get(j)-1);
            }
        }
       }
       return true;

    }
}
