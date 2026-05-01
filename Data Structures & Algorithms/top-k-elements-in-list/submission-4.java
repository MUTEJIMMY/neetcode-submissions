class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            
            if(hm.containsKey(i)){
                int x = hm.get(i);
                hm.put(i,x+1);
            }else{
                hm.put(i,1);
            }
                 
        }
        System.out.println(hm);
        for(int i = 0; i < nums.length; i++){
            if(hm.get(i) >= k){
                arr[i] = nums[i];
            }
        }
        return arr;
    }
}
