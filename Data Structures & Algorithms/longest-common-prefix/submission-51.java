class Solution {
    public String longestCommonPrefix(String[] strs) {
         
        String answer = "";

        for(int i = 0; i < strs.length; i++){
            String checker = "";
            Boolean bool = true;
            for(int j = 0; j < strs.length(); j++){
                checker += strs[j].charAt(i);
                if(checker.charAt(0).equals(strs[j].charAt(i))){
                    bool = false;
                }
            }
            if(bool){
                answer += strs[j].charAt(i);
            }
            else{
                break;
            }
        }

        return answer;
    }
}