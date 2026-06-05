class TimeMap {
    public static Map<String,TreeMap<Integer,String>> a;
    public TimeMap() {
      a = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
    if(!a.containsKey(key))
    {
      a.put(key,new TreeMap<>());
     
    }
      a.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
       if(!a.containsKey(key)) return "";
       TreeMap<Integer,String> t = a.get(key);
       Map.Entry<Integer,String> entry = t.floorEntry(timestamp);
       return entry==null?"":entry.getValue();

    }
    }