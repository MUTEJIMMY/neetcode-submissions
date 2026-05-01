class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            
            if(hm.containsKey(nums[i])){
                int x = hm.get(nums[i]);
                hm.put(nums[i],x+1);
            }else{
                hm.put(nums[i],1);
            }
            System.out.print(nums[i]);
            int x = hm.get(nums[i]);
            System.out.println("Here is x which is hm.get(nums[i]): " + x );
                if(hm.get(nums[i]) >= k){
                    
                    arr[i] = nums[i];
                }
        }
        System.out.println(hm);
        /*
        
        for(int i = 0; i < nums.length; i++){
            int x = hm.get(nums[i]);
            
            if( x >= k){
                arr[i] = nums[i];
            }
        }
        */
        return arr;
    }
}
