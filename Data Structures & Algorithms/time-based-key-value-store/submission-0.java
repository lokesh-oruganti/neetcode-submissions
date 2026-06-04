class TimeMap {

    private HashMap<String, TreeMap<Integer, String>> hp;
    public TimeMap() {
        hp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        hp.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!hp.containsKey(key)){
            return "";
        }
        TreeMap<Integer, String> timestamps = hp.get(key);
        Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */