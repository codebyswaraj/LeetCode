class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int start=0, end=height.length-1;
        int maxArea = 0;
        while(start<end){
            int currArea = Math.min(height[start], height[end]) * (end-start);
            maxArea = Math.max(maxArea, currArea);
            if(height[start] < height[end])
                start++;
            else
                end--;
        }
        return maxArea;        
    }
}