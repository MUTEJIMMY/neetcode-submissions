class Solution {
    public int[] sortArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int inbetween;
            for(int j = 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    inbetween = nums[i];
                    nums[i] = nums[j];
                    nums[j] = inbetween;
                }
            }
        }
        return nums;
    }
}