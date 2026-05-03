class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int counter = 0;
        int max = 0;
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                int x = hm.get(nums[i]);
                hm.put(nums[i], x+1);
                counter = x+1;
                if(max < counter ){
                    max = counter;
                    answer = nums[i];
                }
            }
            else{
                hm.put(nums[i], 1);
            }
        }
        System.out.println(hm);
        return answer;
    }
}