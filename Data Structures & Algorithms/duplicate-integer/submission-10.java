class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hs = new HashSet<>();
        boolean check = false;

        for(int i = 0; i < nums.length; i++){
            if(!hs.contains(nums[i])){
                System.out.println(nums[i]);
                hs.add(nums[i]);
                System.out.println("hello");
                
            }
            else{
                System.out.println("goodbye");
                check = true;
            }
        }
        return check;
    }
}