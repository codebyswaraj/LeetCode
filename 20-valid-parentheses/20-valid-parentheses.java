class Solution {
    public boolean isValid(String s) {
        if(s==null || s.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            switch(c){
                case '}':
                    if(stack.isEmpty()) return false;
                    if(stack.pop()=='{')continue;
                    else return false;
                case ']':
                    if(stack.isEmpty()) return false;
                    if(stack.pop()=='[')continue;
                    else return false;
                case ')':
                    if(stack.isEmpty()) return false;
                    if(stack.pop()=='(')continue;
                    else return false;
                default:
                    stack.push(c);
            }
        }
       return stack.isEmpty();
    }
}