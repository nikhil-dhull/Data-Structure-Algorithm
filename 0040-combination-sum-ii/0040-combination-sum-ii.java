class Solution {
    public void findCombination(int[] arr,int target,int idx,List<List<Integer>>ans,List<Integer>res){
        int sum=0;
        if(target==0){
            ans.add(new ArrayList<>(res));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
        if (arr[i] <= target) {
            res.add(arr[i]);
            findCombination( arr, target - arr[i],i+1, ans, res);
            res.remove(res.size() - 1);
        }
    }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        findCombination(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
}