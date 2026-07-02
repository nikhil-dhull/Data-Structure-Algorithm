class Solution {

    public void getAllSubsets(int[] nums,List<Integer> ans,List<List<Integer>> AllSubset,int i){
        if(i==nums.length){
            AllSubset.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[i]);
        getAllSubsets(nums,ans,AllSubset,i+1);

        ans.remove(ans.size()-1);
        int idx=i+1;
        while(idx<nums.length && nums[idx]==nums[idx-1] ) idx++;

        getAllSubsets(nums,ans,AllSubset,idx);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> AllSubset=new ArrayList<>();
        getAllSubsets(nums,new ArrayList<>(),AllSubset,0);
        return AllSubset;
    }
}