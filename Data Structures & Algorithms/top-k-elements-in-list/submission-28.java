class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int arrlength = 0;

        int[] arr = new int[nums.length];

        int j=-1;

        for(int i = 0; i < nums.length; i++){
            
            if(hm.containsKey(nums[i])){
                int x = hm.get(nums[i]);
                hm.put(nums[i],x+1);
                if(hm.get(nums[i]) >= k){
                    arrlength++;
                    System.out.println("arrlength = " + arrlength);
                }
            }else{
                hm.put(nums[i],1);
            }
            System.out.println(nums[i]);
            int x = hm.get(nums[i]);
            System.out.println("Here is x which is hm.get(nums[i]): " + x );
                if(x >= k){
                    
                    arr[j+1] = nums[i];
                    j++;
                }
        }
        System.out.println(hm);

        return arr;
    }
}
