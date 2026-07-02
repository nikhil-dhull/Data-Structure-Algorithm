class Solution {
    public int thirdMax(int[] nums) {
        int count=1;
        int n=nums.length-1;
        Arrays.sort(nums);
        for(int i=n;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        return nums[n];
    }
}