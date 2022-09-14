class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0) return false;
        // Create a set to check if any duplicates exists
        Set<Integer> store = new HashSet<>();
        for(int i: nums){
            if(store.contains(i)) return true;
            store.add(i);
        }
        return false;
    }
}