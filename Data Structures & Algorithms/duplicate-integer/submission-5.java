class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hs = new HashSet<>();
        boolean check = true;

        for(int i = 0; i < nums.length; i++){
            if(!hs.contains(i)){
                hs.add(i);
            }
            else{
                check = false;
            }
        }
        return check;
    }
}