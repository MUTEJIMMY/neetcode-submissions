class Solution {
    public int removeElement(int[] nums, int val) {
        //int[] arr = new int[nums.length];
        int k = 0;
        int tracker = 1;
        int inbetween = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                
                inbetween = nums[nums.length-tracker];
                nums[nums.length-tracker] = nums[i];
                nums[i] = inbetween;
                tracker ++;
                System.out.println(tracker + "  " + inbetween );

            }
            else{
                k++;
                System.out.println("IN the k loop");
            }
        }
        System.out.println(k);
        return k;
    }
}