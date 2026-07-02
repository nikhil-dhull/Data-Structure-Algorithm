class Solution {
    void getAllSubsets(int[] nums,List<Integer> ans,List<List<Integer>> AllSubset,int i){
        if(i==nums.length){
            AllSubset.add(new ArrayList<>(ans));
            return;
        }
        //for including
        ans.add(nums[i]);
        getAllSubsets(nums,ans,AllSubset,i+1);

        //for excluding
        ans.remove(ans.size()-1);
        getAllSubsets(nums,ans,AllSubset,i+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> AllSubset=new ArrayList<>();
        getAllSubsets(nums,new ArrayList<>(),AllSubset,0);
        return AllSubset;
    }
}