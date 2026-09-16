class Solution {
    public boolean isAnagram(String s, String t) {
        boolean answer = false;
        HashSet<Character> hs = new HashSet<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            hs.add(s.charAt(i));
        }

        for(int i = 0; i < t.length(); i++){
            if(hs.contains(t.charAt(i))){
                answer = true;
            }
            else{
                answer = false;
            }
        }

        return answer;
    }
}
