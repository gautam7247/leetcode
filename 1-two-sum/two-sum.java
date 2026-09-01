class Solution {
    public int[] twoSum(int[] arr, int target) {
         HashMap<Integer,Integer> mp=new HashMap<>();
         for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(mp.containsKey(diff)){
                return new int[]{mp.get(diff),i};
            }
            mp.put(arr[i],i);
         }
         return new int[]{};
    }
}