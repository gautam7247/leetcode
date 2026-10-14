class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

    int []ans=new int[n];

    int pre=1;
    ans[0]=1;
    for(int i=1;i<n;i++){
       pre=pre*nums[i-1];
       ans[i]=pre;
    }
    int suf=1;
    for(int i=n-2;i>=0;i--){
       suf=suf*nums[i+1];
       ans[i]=ans[i]*suf;
    }

   return ans;
    }
}