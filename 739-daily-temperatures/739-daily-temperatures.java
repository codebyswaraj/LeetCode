class Solution {
    public int[] dailyTemperatures(int[] t) {
        if(t==null || t.length==0) return new int[]{};
        Stack<Integer> store = new Stack<>();
        int[] res = new int[t.length];
        for(int i=0; i<t.length; i++){
            while(!store.isEmpty() && t[store.peek()] < t[i]){
                int j = store.pop();
                res[j] = i-j;
            }
            store.add(i);
        }
        return res;
    }
}