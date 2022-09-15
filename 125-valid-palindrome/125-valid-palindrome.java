class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return true;
        // As per question output is ignoring case
        s = s.toLowerCase();
        int i=0, j=s.length()-1;
        while(i<=j){
            if(!checkValidChar(s, i)&& i<j) {
                i++;
                continue;
            }
            if(!checkValidChar(s, j)&& i<j) {
                j--;
                continue;
            }
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
    
    private boolean checkValidChar(String s, int i){
        int c = (int)s.charAt(i);
        if(c >= (int)'a' && c <= (int)'z') return true;
        if(c >= (int)'0' && c <= (int)'9') return true;
        return false;
    }
}