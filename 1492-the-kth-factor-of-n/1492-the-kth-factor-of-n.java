class Solution {
    public int kthFactor(int n, int k) {
        int x=-1;
        int count=0;
        if(n<k) return -1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count==k){
                x=i;
                break;
            }
        }
        return x;
    }
}