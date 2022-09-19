class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length==0) return 0;
        Stack<Integer> nums = new Stack<>();
        String currOp = "";
        for(String token : tokens ){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int v2 = nums.pop();
                int v1 = nums.pop();
                nums.push(getResultByOp(v1, v2, token));
            }else{
                nums.push(Integer.valueOf(token));
            }
        }
        return nums.pop();
    }
    
    public int getResultByOp(int v1, int v2, String token){
        if(token.equals("+")) return v1+v2;
        if(token.equals("-")) return v1-v2;
        if(token.equals("*")) return v1*v2;
        return v1/v2;
    }
}