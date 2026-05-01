class Solution {
    public String longestCommonPrefix(String[] strs) {
         
        String answer = "";

        for(int i = 0; i < strs.length; i++){
            System.out.println(strs[0].length());
            String checker = "";
            Boolean bool = true;

            System.out.println("Entering loop");
            for(int j = 0; j < strs[0].length(); j++){
                System.out.println(j);
                checker += strs[j].charAt(i);
                System.out.println(checker);

                if(checker.charAt(0) == strs[j].charAt(i)){
                    
                }else{
                    bool = false;
                }
            }
            System.out.println("Exiting Loop");
            if(bool){
                answer += strs[0].charAt(i);
            }
            else{
                break;
            }

        }
        //System.out.println("Hello");
        return answer;
    }
}