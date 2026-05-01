class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = strs[0];
            for(int j = 0; j<s.length; j++){
                if(!hm.containsKey(s[j])){
                    hm.put(s[j],1);
                }else{
                    x = hm.get(s[j]);
                    hm.put(s[j], x+1);
                }
            }
        }
    }
}