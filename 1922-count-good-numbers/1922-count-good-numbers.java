class Solution {
    static final long MOD = 1000000007;
    public long pow(long x,long n){
        long res=1;
        while(n>0){
            if(n%2==1){
                res=(res*x)%MOD;
            }
            x=(x*x)%MOD;
            n/=2;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long ans=(pow(5,even)*pow(4,odd))%MOD;
        return (int)ans;
    }
}