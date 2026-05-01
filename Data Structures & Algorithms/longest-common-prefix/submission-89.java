class Solution {
    public String longestCommonPrefix(String[] strs) {
         
        String answer = "";
    
        for(int i = 0; i < strs.length; i++){
            String checker = "";
            Boolean bool = true;
            for(int j = 0; j < strs[0].length(); j++){
                System.out.println(strs[j]);
                System.out.println(j);
                System.out.println(strs[j].charAt(i));
                checker += strs[j].charAt(i);
                System.out.println(checker);
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