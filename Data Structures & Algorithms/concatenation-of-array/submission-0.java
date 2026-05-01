class Solution {
    public int[] getConcatenation(int[] nums) {

        int x = nums.length;
        int y =x*2;

        int[] ans = new int[(y)];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[(x*(i+1))-1] = nums[i];
        }
        return ans;
    }
}