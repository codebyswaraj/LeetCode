class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int result = 1;
        Set<Integer> store = new HashSet<>();
        for(int num: nums) store.add(num);
        for(int num: nums){
            if(!store.contains(num-1)){
                int currCount = 1;
                while(store.contains(num+1)){
                    currCount++;
                    num++;
                }
                result = Math.max(currCount, result);
            }
        }
        return result;
    }
}