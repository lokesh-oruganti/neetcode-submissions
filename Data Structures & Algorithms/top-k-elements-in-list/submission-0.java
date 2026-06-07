class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hp = new HashMap<>();

        for(int num: nums){
            hp.put(num,hp.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> minheap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(Map.Entry<Integer,Integer> entry: hp.entrySet())
        {
            minheap.offer(new int[]{entry.getValue(),entry.getKey()});
            if(minheap.size() > k){
                minheap.poll();
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = minheap.poll()[1];
        }
        return res;

    }
}
