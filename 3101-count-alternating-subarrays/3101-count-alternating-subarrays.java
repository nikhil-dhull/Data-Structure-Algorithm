class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long curr=1;
        long ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                curr++;
            }else{
                curr=1;
            }
            ans+=curr;
        }
        return ans;
    }
}