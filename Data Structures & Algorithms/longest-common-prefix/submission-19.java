class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String string = strs[i];
            int x = string.length();
            for(int j = 0; j < x; j++){
                
                if(!hm.containsKey(string.charAt(j))){
                    hm.put(string.charAt(j),1);
                }else{
                    x = hm.get(string.charAt(j));
                    hm.put(string.charAt(j), x+1);
                }
            }
        }
    }
}