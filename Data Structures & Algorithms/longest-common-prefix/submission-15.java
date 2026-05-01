class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String string = strs[i];
            int x = string.length();
            for(int j = 0; j < x; j++){
                System.out.println(string[j]);
                if(!hm.containsKey(string[j])){
                    hm.put(string[j],1);
                }else{
                    x = hm.get(string[j]);
                    hm.put(string[j], x+1);
                }
            }
        }
    }
}