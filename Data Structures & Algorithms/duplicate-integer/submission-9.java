class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hs = new HashSet<>();
        boolean check = true;

        for(int i = 0; i < nums.length; i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                System.out.println("hello");

            }
            else{
                System.out.println("hello");
                check = false;
            }
        }
        return check;
    }
}