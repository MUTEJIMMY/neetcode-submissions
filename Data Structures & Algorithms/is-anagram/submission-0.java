class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> hm1 = new HashMap<>();
                HashMap<Character, Integer> hm2 = new HashMap<>();

        int x = s.length();
        int y = t.length();
        if(x != y ){
            return false;
        }

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);
            if(!hm1.containsKey(c)){
                hm1.put(c,1);
            }else{
                x = hm1.get(c);
                x++;
                hm1.put(c,x);
            }
            

        }
        
        for(int i = 0; i < t.length(); i++){

            char c = t.charAt(i);
            if(!hm2.containsKey(c)){
                hm2.put(c,1);
            }else{
                x = hm2.get(c);
                x++;
                hm2.put(c,x);
            }
        }
        return hm1.equals(hm2);
    }
}
