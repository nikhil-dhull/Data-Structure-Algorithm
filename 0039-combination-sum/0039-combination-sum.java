class Solution {
    public void findCombination(int idx,int[] arr,int target,List<List<Integer>>ans,List<Integer>res){
            if(target==0){
                ans.add(new ArrayList<>(res));
                return;
            }
            
        
        for (int i = idx; i < arr.length; i++) {
        if (arr[i] <= target) {
            res.add(arr[i]);
            findCombination(i, arr, target - arr[i], ans, res);
            res.remove(res.size() - 1);
        }
    }
        // findCombination(idx+1,arr,target,ans,res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}