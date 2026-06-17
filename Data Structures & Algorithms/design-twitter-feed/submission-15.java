class Twitter {
    Map<Integer,Integer> tweet;
    Map<Integer,Set<Integer>> follow;
    PriorityQueue<int []> latestTweet;
    List<Integer> toptweets;
    int timestamp=0;

    public Twitter() {
        tweet=new HashMap<>();
        follow=new HashMap<>();
        latestTweet=new PriorityQueue<>((a,b)->a[0]-b[0]);
    
        
    }
    
    public void postTweet(int userId, int tweetId) {
        timestamp++;
        tweet.put(tweetId,userId);
        latestTweet.offer(new int[]{timestamp,tweetId});
        // if(latestTweet.size()>10)
        // {
        //     latestTweet.poll();
        // }

    }
    
    public List<Integer> getNewsFeed(int userId) {
        toptweets=new ArrayList<>();

        int[][] array= new int[latestTweet.size()][2];
        int i=0;

        while(!latestTweet.isEmpty())
        {
         int id=latestTweet.peek()[1];
         int time=latestTweet.poll()[0];
         int user=tweet.get(id); 
         if(follow.containsKey(userId) && follow.get(userId).contains(user))
         {
         toptweets.add(id);
         }
         else if(user==userId)
         {
           toptweets.add(id); 
         }
         array[i][0]=time;
         array[i++][1]=id;
         
        }
        for(int k=0;k<array.length;k++)
        {
            latestTweet.offer(new int[]{array[k][0],array[k][1]});
        }
        
        while(toptweets.size()>10)
        {
            int z=0;
            toptweets.remove(z);
            z++;
        }
        Collections.reverse(toptweets);
        
        return toptweets;
               
    }
    
    public void follow(int followerId, int followeeId) {
        if(!follow.containsKey(followerId))
        {
           follow.put(followerId,new HashSet<>()); 
        }
        follow.get(followerId).add(followeeId);

    }
    
    public void unfollow(int followerId, int followeeId) {
        follow.get(followerId).remove(followeeId);
    }
}
