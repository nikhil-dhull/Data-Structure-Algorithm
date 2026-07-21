class Solution {
    public void backtrack(int[] nums,int start,List<List<Integer>> result,List<Integer> path){
        if(path.size()>=2){
            result.add(new ArrayList<>(path));
           
        }
        Set<Integer> used=new HashSet<>();
        for(int i=start;i<nums.length;i++){
            if(used.contains(nums[i])) continue;
            if(path.isEmpty() || nums[i]>=path.get(path.size()-1)){
                used.add(nums[i]);
                path.add(nums[i]);
                backtrack(nums,i+1,result,path);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,0,result,new ArrayList<>());
        return result;
    }
}