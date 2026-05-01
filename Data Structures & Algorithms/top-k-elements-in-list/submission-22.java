class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arrlength = 0;
        int[] arr = new int[arrlength];
        int j=-1;
        for(int i = 0; i < nums.length; i++){
            
            if(hm.containsKey(nums[i])){
                int x = hm.get(nums[i]);
                hm.put(nums[i],x+1);
                if(hm.get(nums[i]) >= k){
                    arrlength++;
                }
            }else{
                hm.put(nums[i],1);
            }
            System.out.println(nums[i]);
            int x = hm.get(nums[i]);
            System.out.println("Here is x which is hm.get(nums[i]): " + x );
                if(x >= k){
                    System.out.print()
                    arr[j+1] = nums[i];
                    j++;
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
