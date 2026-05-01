class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int index0 = 0;
        int index1 = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i!=j && (i + j == target)){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
