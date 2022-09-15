class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length ==0) return new int[0];
        // Create frequency
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i: nums)
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        
        // Create Min Heap and when there are more than k elements then remove the element with lowest freq
        int[] result = new int[k];
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> e: freq.entrySet()){
            heap.add(e);
            if(heap.size() > k) heap.poll();
        }
        
        int i = 0;
        while(!heap.isEmpty()){
            result[i] = heap.poll().getKey();
            i++;
        }          
        
        return result;
       
    }
}