class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) return 0;
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int result = 0;
        int maxLeft = height[0], maxRight = height[len-1];
        for(int i=0; i<len; i++){
            left[i] = Math.max(maxLeft, height[i]);
            maxLeft = left[i];
        }
        for(int i=len-1; i>=0; i--){
            right[i] = Math.max(maxRight, height[i]);
            maxRight = right[i];
        }
        for(int i=0; i<len; i++)
            result += Math.min(left[i], right[i])-height[i];
        return result;
    }
}