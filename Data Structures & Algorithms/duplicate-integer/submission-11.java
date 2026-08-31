class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hs = new HashSet<>();
        Boolean answer = false;

        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])){
                answer = true;
            }
            hs.add(nums[i]);
        }
        return answer;
    }
}