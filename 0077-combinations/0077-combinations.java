class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> subarr=new ArrayList<>();
    public void f(int n,int k,int count,int num){
        if(count==k){
            res.add(new ArrayList<>(subarr));
            return;
        }
        if(num>n) return;
        subarr.add(num);
        f(n,k,count+1,num+1);
        subarr.remove(subarr.size()-1);
        count--;
        f(n,k,count+1,num+1);

    }
    public List<List<Integer>> combine(int n, int k) {
        f(n,k,0,1);
        return res;
    }
}