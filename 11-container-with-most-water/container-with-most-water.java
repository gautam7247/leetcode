class Solution {
    public int maxArea(int[] height) {
    int maxWater=0;
    int i=0;
    int j=height.length-1;
    while(i<j){
        int min=Math.min(height[i],height[j]);
        int area=min*(j-i);
        if(area>maxWater){
            maxWater=area;
        }
        if(height[i]<height[j]){
            i++;
        }
        else{
            j--;
        }

    }




  return maxWater;

    }
}