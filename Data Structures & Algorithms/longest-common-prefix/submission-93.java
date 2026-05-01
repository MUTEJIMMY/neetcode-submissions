class Solution {
    public String longestCommonPrefix(String[] strs) {
         
        String answer = "";
    
        for(int i = 0; i < strs[0].length(); i++){

            String checker = "";
            Boolean bool = true;
            for(int j = 0; j < strs.length; j++){
                System.out.println(strs[j].charAt(i));
                checker += strs[j].charAt(i);

                if(checker.charAt(0) == strs[j].charAt(i)){
                    bool = false;
                }
            }
            if(bool){
                answer += strs[0].charAt(i);
            }
            else{
                break;
            }
        }

        return answer;
    }
}