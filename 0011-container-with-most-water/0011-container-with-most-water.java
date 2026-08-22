class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxV=0;
        while(left<right){
            int wid=right-left;
            int heigh=Math.min(height[left],height[right]);
            int area=wid*heigh;
            maxV=Math.max(maxV,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxV;
    }
}