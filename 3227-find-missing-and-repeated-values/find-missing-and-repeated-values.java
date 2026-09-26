class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        int n=grid.length;
        int lastNum=n*n;
        int currSum=0;
        int[] nums=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                 nums[0]=grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                    currSum+=grid[i][j];
                }
            }
        }
        int total_Sum=lastNum*(lastNum+1)/2;
        nums[1]=total_Sum-currSum;
        return nums;
    }
}