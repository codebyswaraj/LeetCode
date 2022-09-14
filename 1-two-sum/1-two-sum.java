class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length ==0) return new int[0];
        // Store the current number and their index in map to return index positions of two numbers where sum is reaching target. If index is not asked use set.
        Map<Integer, Integer> store = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(store.containsKey(target-nums[i]))
                return new int[]{store.get(target-nums[i]), i};
            store.put(nums[i], i);
        }
        return new int[0];
    }
}