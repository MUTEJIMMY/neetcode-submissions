class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String string = strs[i];

             
            System.out.println("Here is our string: " + string);
            for(int j = 0; j < string.length(); j++){
                
                System.out.println("Here is our length: " + string.length());
                System.out.println("Here is our string.charAt(j): " + string.charAt(j));
                if(!hm.containsKey(string.charAt(j))){
                    hm.put(string.charAt(j),1);
                }else{
                    x = hm.get(string.charAt(j));
                    hm.put(string.charAt(j), x+1);
                }
            }
        }
        return "";
    }
}