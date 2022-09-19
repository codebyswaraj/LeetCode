class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()) return 0;
        int maxLen = 1, left =0, right =0;
        boolean[] store = new boolean[256];
        store[s.charAt(right)] = true;
        for(right = 1; right<s.length(); right++){
            if(store[s.charAt(right)]){
                while(s.charAt(left) != s.charAt(right)){
                    System.out.println("here");
                    store[s.charAt(left)] = false;
                    left++;
                }
                left += 1;
            }
            store[s.charAt(right)] = true;
            maxLen = Math.max(maxLen, right-left+1);    
        }
        return maxLen;   
    }
}