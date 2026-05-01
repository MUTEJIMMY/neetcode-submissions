class Solution {
    public String longestCommonPrefix(String[] strs) {
         
        String answer = "";

        for(int i = 0; i < strs[0].length(); i++){
            System.out.println("here is strs[0].length(): " + strs[0].length());
            String checker = "";
            Boolean bool = true;

            //System.out.println("Entering loop");
            for(int j = 0; j < strs.length; j++){
                System.out.println("here is the j for this loop: " + j);
                System.out.println("here is strs[0].charAt(i): " + strs[0].charAt(i));
                checker += strs[0].charAt(i);
                System.out.println("Here is checker: " + checker);
                Boolean ifStatement = checker.charAt(0).equals(strs[j].charAt(i));
                System.out.println("Here is ifStatement: " + ifStatement);
                if(ifStatement){
                    
                }else{
                    bool = false;
                }
                System.out.println("");
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