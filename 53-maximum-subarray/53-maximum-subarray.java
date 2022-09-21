class Solution {
    public int maxSubArray(int[] nums) {
        if(nums ==null || nums.length==0) return 0;
        int max_sum = Integer.MIN_VALUE, max_so_far = 0;
        
        for(int i =0; i<nums.length; i++){
            max_so_far += nums[i];
            max_sum = Math.max(max_sum, max_so_far);
            if(max_so_far < 0)
                max_so_far = 0;            
        }
        return max_sum;
    }
}