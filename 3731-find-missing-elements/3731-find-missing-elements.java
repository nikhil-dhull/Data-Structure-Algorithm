class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int j=0;
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}