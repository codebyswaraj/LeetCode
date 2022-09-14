class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) return false;
        // Store the count of characters in first string and decrease for other, if temp store is back to 0 means both string is anagram.
        int[] store = new int[256];
        for(char c: s.toCharArray())
            store[c]++;
        for(char c: t.toCharArray())
            store[c]--;
        
        for(int i:store)
            if(i!=0) return false;
        return true;        
    }
}