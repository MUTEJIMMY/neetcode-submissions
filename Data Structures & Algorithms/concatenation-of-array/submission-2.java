class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
            if(i == 0){
                arr[nums.length] = nums[i];
            }else{
                
                arr[nums.length+i] = nums[i];
            }
        }
        return arr;
    }
}