import java.util.stream.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        // Create key of sorted string and keep actual string in value list
        Map<String, List<String>> store = new HashMap<>();
        for(String str: strs){
            String sorted = sortString(str);
            List<String> vals = store.getOrDefault(sorted, new ArrayList<>());
            vals.add(str);
            store.put(sorted, vals);
        }
        return store.values().stream().collect(Collectors.toList());
    }
    
    /**
    * Method to sort string
    */
    private String sortString(String s){
        if(s == null || s.isEmpty()) return s;
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        return new String(sArr);
    }
}