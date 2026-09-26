class Solution {
    public int majorityElement(int[] nums) {
      int count=0;
      int maj=0;
      for(int i=0;i<nums.length;i++){
        if(count==0){
            maj=nums[i];
            
        }
        if(maj==nums[i]){
            count++;
        }else{
            count--;
        }
        if(count==-1){
            maj=nums[i];
            count=1;
        }
      }  
      return maj;
    }
}