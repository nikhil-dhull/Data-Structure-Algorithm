class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;
        int j=0;
        int maxlen=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        while(j<nums.length){
            freq.put(nums[j],freq.getOrDefault(nums[j],0)+1);
            while(freq.get(nums[j])>k){
                freq.put(nums[i],freq.getOrDefault(nums[i],0)-1);
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}