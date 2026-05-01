class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.lenght; i++){
            for(int j = 0; j < nums.lenght; j++){
                if(nums[j]==nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}